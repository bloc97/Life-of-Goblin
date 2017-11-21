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
public class NoFlightBehaviour implements FlightBehaviour {

    @Override
    public void fly() {
        System.out.println("Can't fly :(");
    }

    @Override
    public void land() {
        
    }

    @Override
    public double getAltitude() {
        return 0;
    }
    
}
