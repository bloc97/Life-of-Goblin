/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import composition.Behaviours.FlightBehaviour;
import composition.Behaviours.HasFlightBehaviour;
import composition.Behaviours.MachineFlightBehaviour;

/**
 *
 * @author bowen
 */
public class Airplane implements HasFlightBehaviour {
    
    private final FlightBehaviour flightBehaviour;

    public Airplane() {
        flightBehaviour = new MachineFlightBehaviour();
    }
    
    @Override
    public FlightBehaviour getFlightBehaviour() {
        return flightBehaviour;
    }
    
    @Override
    public String toString() {
        return "Airplane";
    }
    
}
