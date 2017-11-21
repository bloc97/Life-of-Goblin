/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeongame;

/**
 *
 * @author bowen
 */
public abstract class CombatUtils {
    public static void combat(Combatant combatant, Combatant ennemy, ExtendedRandom random) {
        
        boolean isCrit = random.nextDouble() < combatant.getCritChance();
        boolean isDodge = random.nextDouble() < combatant.getDodgeChance();
        boolean isEnnemyCrit = random.nextDouble() < ennemy.getCritChance();
        boolean isEnnemyDodge = random.nextDouble() < ennemy.getDodgeChance();
        
        if (!isEnnemyDodge) {
            int damage = Math.max(combatant.getAttack() - ennemy.getDefense(), 1);
            if (isCrit) {
                damage *= 2;
                System.out.println("You deal " + damage + " (Critical) damage.");
            } else {
                System.out.println("You deal " + damage + " damage.");
            }
            ennemy.setHealth(ennemy.getHealth() - damage);
        } else {
            System.out.println("You missed! The ennemy dodged.");
        }
        
        if (!isDodge) {
            int damage = Math.max(ennemy.getAttack() - combatant.getDefense(), 1);
            if (isEnnemyCrit) {
                damage *= 2;
                System.out.println("The ennemy deals " + damage + " (Critical) damage.");
            } else {
                System.out.println("The ennemy deals " + damage + " damage.");
            }
            combatant.setHealth(combatant.getHealth() - damage);
        } else {
            System.out.println("The ennemy missed! You dodged.");
        }
    }
}
