package composition;

import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bowen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Composition\n");
        
        Bird chick = new Bird("Chick");
        Bird finch = new Bird("Finch");
        Bird sparrow = new Bird("Sparrow");
        Bird ostrich = new Ostrich();
        Bird penguin = new Penguin();
        Bird pigeon = new Pigeon();
        Bird birdy2000 = new CyborgBird();
        
        List<Bird> birdList = new LinkedList<>();
        birdList.add(chick);
        birdList.add(finch);
        birdList.add(sparrow);
        birdList.add(ostrich);
        birdList.add(penguin);
        birdList.add(pigeon);
        birdList.add(birdy2000);
        
        for (Bird bird : birdList) {
            System.out.println(bird);
            bird.fly();
            bird.chirp();
            bird.land();
            bird.peck();
            System.out.println("");
        }
        
        Airplane plane = new Airplane();
        System.out.println(plane);
        plane.fly();
        plane.land();
    }
    
}
