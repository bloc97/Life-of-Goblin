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
public class CyborgBirdBuilder extends Airplane {
    
    //Extends Airplane but now its not a bird anymore!
    //We have to make a builder to transform to bird...
    //We can do better than this...
    public Bird getBird() {
        Airplane thisCyborg = this;
        return new Bird("CybordBird") {
            @Override
            public void fly() {
                thisCyborg.fly();
            }

            @Override
            public void land() {
                thisCyborg.land();
            }
            
            @Override
            public double getAltitude() {
                return thisCyborg.getAltitude();
            }
            
        };
    }
    
    @Override
    public String toString() {
        return "CyborgBird";
    }
}
