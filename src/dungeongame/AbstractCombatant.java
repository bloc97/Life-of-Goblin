/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeongame;

/**
 *
 * @author bowen
 */
public class AbstractCombatant implements Combatant {
    
    int health, attack, defense;
    double critChance, dodgeChance;

    public AbstractCombatant(int health, int attack, int defense, double critChance, double dodgeChance) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.critChance = critChance;
        this.dodgeChance = dodgeChance;
    }

    @Override
    public int getAttack() {
        return attack;
    }
    

    @Override
    public void setHealth(int health) {
        this.health = Math.max(health, 0);
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public double getCritChance() {
        return critChance;
    }

    @Override
    public double getDodgeChance() {
        return dodgeChance;
    }
    
}
