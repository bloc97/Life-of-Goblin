/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeongame;

import java.util.Random;

/**
 *
 * @author bowen
 */
public class ExtendedRandom extends Random {
    public ExtendedRandom(long seed) {
        super(seed);
    }

    public int nextInt(int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            int temp = upperBound;
            upperBound = lowerBound;
            lowerBound = temp;
        }
        int bound = upperBound - lowerBound;
        return lowerBound + super.nextInt(bound);
    }
    
    
    
}
