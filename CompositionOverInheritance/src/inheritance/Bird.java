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
public class Bird implements Flyable {

    private double altitude = 0;
    private final String name;
    
    public Bird(String name) {
        this.name = name;
    }
    
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

    public void peck() {
        System.out.println("Peck peck.");
    }

    public String chirp() {
        String chirp = "Chirp chirp!";
        System.out.println(chirp);
        return chirp;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
