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
public class Pigeon extends Bird {

    public Pigeon() {
        super("Pigeon");
    }
    
    @Override
    public String chirp() {
        String chirp = "Roooo Rooo!";
        System.out.println(chirp);
        return chirp;
    }
}
