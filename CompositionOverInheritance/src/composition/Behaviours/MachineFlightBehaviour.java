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
public class MachineFlightBehaviour implements FlightBehaviour {
    
    private double altitude = 0;

    @Override
    public void fly() {
        System.out.println("Tshhhhhshshshsh");
        altitude = 8000;
    }

    @Override
    public void land() {
        System.out.println("Thump!");
        altitude = 0;
    }

    @Override
    public double getAltitude() {
        return altitude;
    }
    
}
