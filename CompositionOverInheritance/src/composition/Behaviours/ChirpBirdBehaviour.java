/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition.Behaviours;

/**
 *
 * @author bowen
 */
public class ChirpBirdBehaviour implements BirdBehaviour {
    
    @Override
    public void peck() {
        System.out.println("Peck peck!");
    }
    @Override
    public String chirp() {
        String chirp = "Chirp chirp!";
        System.out.println(chirp);
        return chirp;
    }
}
