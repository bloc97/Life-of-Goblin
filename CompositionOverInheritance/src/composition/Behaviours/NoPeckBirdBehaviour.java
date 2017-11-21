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
public class NoPeckBirdBehaviour extends ChirpBirdBehaviour {
    
    @Override
    public void peck() {
        System.out.println("Can't peck :(");
    }
    
}
