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
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getStepsTaken(){
        return stepsTaken;
    }
    
    public void setX(int newX){
        x = newX;
    }
    
    public void setY(int newY){
        y = newY;
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
    
    //the bugs are only moving up and to the left
    public void Move(){
        //pick direction
        int newX = x + World.getRandom(-1,1);
        int newY = y + World.getRandom(-1,1);
        
        //if(point exists && point is empty)
            //set x and y to newX and newY, also use world.setAt(newX, newY, this)
        if(world.pointExists(newX,newY)){
            if(world.pointIsFree(newX, newY)){
                //can move
                world.changePosition(newX, newY, this);
            }else{
                //something else is there
            }
        }else{
            //can't move there
        }
    }
    
    @Override
    public String toString(){
        return ("Organism");
    }
}
