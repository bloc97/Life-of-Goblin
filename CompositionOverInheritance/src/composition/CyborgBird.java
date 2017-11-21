/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import composition.Behaviours.BirdBehaviour;
import composition.Behaviours.ChirpBirdBehaviour;
import composition.Behaviours.MachineFlightBehaviour;

/**
 *
 * @author bowen
 */
public class CyborgBird extends Bird {
    
    public CyborgBird() {
        this("CyborgBird", new ChirpBirdBehaviour());
    }
    public CyborgBird(String name, BirdBehaviour birdBehaviour) {
        super(name, birdBehaviour, new MachineFlightBehaviour());
    }
    
}
