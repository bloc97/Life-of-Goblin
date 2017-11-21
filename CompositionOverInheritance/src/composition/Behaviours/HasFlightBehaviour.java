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
public interface HasFlightBehaviour {
    public FlightBehaviour getFlightBehaviour();
    public default void fly() {
        getFlightBehaviour().fly();
    }
    public default void land() {
        getFlightBehaviour().land();
    }
    public default double getAltitude() {
        return getFlightBehaviour().getAltitude();
    }
}
