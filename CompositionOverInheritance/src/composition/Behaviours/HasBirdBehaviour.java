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
public interface HasBirdBehaviour {
    public BirdBehaviour getBirdBehaviour();
    public default void peck() {
        getBirdBehaviour().peck();
    }
    public default String chirp() {
        return getBirdBehaviour().chirp();
    }
}
