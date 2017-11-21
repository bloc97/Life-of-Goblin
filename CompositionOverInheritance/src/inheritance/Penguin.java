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
public class Penguin extends Bird {

    public Penguin() {
        super("Penguin");
    }
    
    //If can't fly nor peck, why extends bird?
    @Override
    public void fly() {
        System.out.println("Can't fly :(");
    }

    @Override
    public void peck() {
        System.out.println("Can't peck :(");
    }
    
    
    
}
