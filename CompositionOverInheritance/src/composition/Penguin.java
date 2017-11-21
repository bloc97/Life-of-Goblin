/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import composition.Behaviours.NoFlightBehaviour;
import composition.Behaviours.NoPeckBirdBehaviour;

/**
 *
 * @author bowen
 */
public class Penguin extends Bird {

    public Penguin() {
        super("Penguin", new NoPeckBirdBehaviour(), new NoFlightBehaviour());
    }
    
}
