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
public class OrganicFlightBehaviour implements FlightBehaviour {
    
    private double altitude = 0;
    
    @Override
    public void fly() {
        altitude = 200;
    }

    @Override
    public void land() {
        altitude = 0;
    }

    @Override
    public double getAltitude() {
        return altitude;
    }
}
