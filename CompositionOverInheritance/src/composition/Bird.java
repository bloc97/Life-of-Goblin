/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import composition.Behaviours.BirdBehaviour;
import composition.Behaviours.ChirpBirdBehaviour;
import composition.Behaviours.FlightBehaviour;
import composition.Behaviours.HasBirdBehaviour;
import composition.Behaviours.HasFlightBehaviour;
import composition.Behaviours.OrganicFlightBehaviour;

/**
 *
 * @author bowen
 */
public class Bird implements HasFlightBehaviour, HasBirdBehaviour {
    
    private final BirdBehaviour birdBehaviour;
    private final FlightBehaviour flightBehaviour;

    private final String name;
    
    public Bird(String name) {
        this(name, new ChirpBirdBehaviour(), new OrganicFlightBehaviour());
    }
    
    public Bird(String name, BirdBehaviour birdBehaviour) {
        this(name, birdBehaviour, new OrganicFlightBehaviour());
    }
    
    public Bird(String name, BirdBehaviour birdBehaviour, FlightBehaviour flightBehaviour) {
        this.name = name;
        this.birdBehaviour = birdBehaviour;
        this.flightBehaviour = flightBehaviour;
    }
    
    @Override
    public BirdBehaviour getBirdBehaviour() {
        return birdBehaviour;
    }

    @Override
    public FlightBehaviour getFlightBehaviour() {
        return flightBehaviour;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
