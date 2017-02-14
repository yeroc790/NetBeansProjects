/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author hansenc
 */
public abstract class Alien {
    private int health; //0=dead, 100=full health
    private String name; //not used in the rest of the program
    private int damage;
    
    public Alien(){
        health = 100;
        damage = 1;
    }
    
    public Alien(int damage){
        health = 100;
        this.damage = damage;
    }
    
    public Alien(int damage, int health){
        this.health = health;
        this.damage = damage;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public abstract int calculateDamage(AlienPack pack);
}
