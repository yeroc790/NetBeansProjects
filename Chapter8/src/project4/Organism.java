/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author hansenc
 */
public class Organism {
    protected World world;
    protected int x;
    protected int y;
    protected int breedTime;
    protected char type;
    protected boolean simulated;
    protected int stepsTaken;
    
    public Organism(World world, int x, int y, int breedTime){
        this.world = world;
        this.x = x;
        this.y = y;
        this.breedTime = breedTime;
        type = 'Z';
    }
    
    public void setType(char newType){
        type = newType;
    }
    
    public char getType(){
        return type;
    }
    
    public void simulate(){
        if(simulated) return;
        simulated = true;
        
       stepsTaken++;
       
       //check for breeding
       
       //check for moving
       
       return;
    }
    
    public void resetSimulation(){
        simulated = false;
    }
    
    public void Move(){
        //pick direction
        int newX = x + World.getRandom(-1,1);
        int newY = y + World.getRandom(-1,1);
        
        //if(point exists && point is empty)
            //set x and y to newX and newY, also use world.setAt(newX, newY, this)
    }
}
