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
public interface Combatant {
    /*
    Stats:
    Strength vs Endurance
    
    Perception vs Stealth
    
    Agility vs Marksmanship
    Intelligence vs Luck
    
    Resolve vs Faith
    
    Charm vs Intimidation
    
    S P E C I A L
    
    Strength : Attack power (Max damage), carry weight
    Endurance: Health, Stamina
    Resilience: Defense power
    
    Perception: Sees stealth or tricks
    Stealth: Hides yourself and your tricks
    
    Agility: increase dodge chance
    Dexterity: Increases accuracy of melee weapons
    Marksmanship: Increases accuracy of ranged weapons
    
    Accuracy increases minimum damage, up to max damage from Strength, excluding intelligence
    
    Faith: increase crit damage
    Resolve: Panick less
    
    Luck: Increase crit, dodge chance. Minor increase in accuracy of all weapons
    Intelligence: Increases level up rate, increases max damage slightly
    
    Charisma: Barter
    Intimidation: Barter weaker people and chance of other panick in battle
    
    Attribute/Defects
    Use stats points in skills, or vice versa, and grants special attributes
    eg. Deaf: -3 perception, immune to audio attacks, gains 1 skill point
    feeble, 
    strong: gets 3 strength at the cost of 1 skill point
    chance devil: random chances are doubled and effects are quadrupled, gains 1 skill point
    
    
    Skills: Special skills you have
    
    
    */
    
    
    
    public int getAttack();
    public int getDefense();
    public int getHealth();
    public double getCritChance();
    public double getDodgeChance();
    
    public void setHealth(int health);
}
