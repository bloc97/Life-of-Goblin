/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author bowen
 */
public class Airplane implements Flyable {

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

    @Override
    public String toString() {
        return "Airplane";
    }
    
}
