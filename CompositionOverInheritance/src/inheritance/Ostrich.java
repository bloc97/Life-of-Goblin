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
public class Ostrich extends Bird {

    public Ostrich() {
        super("Ostrich");
    }

    //Duplicate code from Penguin class
    @Override
    public void fly() {
        System.out.println("Can't fly :(");
    }
    
    //If can't fly and chirp is different, why extends bird?
    @Override
    public String chirp() {
        String roar = "Roar!";
        System.out.println(roar);
        return roar;
    }
    
}
