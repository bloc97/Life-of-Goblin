/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeongame;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author bowen
 */
public class DungeonGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Combatant player = new AbstractCombatant(100, 10, 8, 0.1d, 0.1d);
        Combatant ennemyBoss = new AbstractCombatant(150, 14, 0, 0, 0.2d);
        
        ExtendedRandom random = new ExtendedRandom(81673416);
        System.out.println(player.getHealth() + " vs " + ennemyBoss.getHealth());
        
        while (true) {
            if (System.in.available() < 1) {
                continue;
            } else {
                while(System.in.available() > 0) {
                    System.in.read();
                }
            }
            CombatUtils.combat(player, ennemyBoss, random);
            System.out.println(player.getHealth() + " vs " + ennemyBoss.getHealth());
            //System.in.read();
            if (player.getHealth() < 1) {
                System.out.println("You lose");
                break;
            } else if (ennemyBoss.getHealth() < 1) {
                System.out.println("You win");
                break;
            }
            
        }
        
    }
    
}
