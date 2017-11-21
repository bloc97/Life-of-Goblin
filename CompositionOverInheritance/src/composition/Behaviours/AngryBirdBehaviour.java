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
public class AngryBirdBehaviour extends ChirpBirdBehaviour {

    @Override
    public String chirp() {
        String roar = "Roar!";
        System.out.println(roar);
        return roar;
    }
    
}
