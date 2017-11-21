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
public class CyborgBirdComposition extends Bird {
    
    private final Airplane mechanical = new Airplane();
    
    //Using a temporary composition fix is much better! But we can go further and use composition since the beginning.
    public CyborgBirdComposition(String name) {
        super("CyborgBird");
    }

    @Override
    public void fly() {
        mechanical.fly();
    }

    @Override
    public void land() {
        mechanical.land();
    }

    @Override
    public double getAltitude() {
        return mechanical.getAltitude();
    }
    
}
