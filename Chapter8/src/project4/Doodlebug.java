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
public class Doodlebug extends Organism{
    private static final int BREED_TIME = 8;
    private static final int STARVE_TIME = 3;
    private int starving; //if starving == STARVE_TIME, it dies
    private static int i = 1;
    private int ID;
    
    public Doodlebug(World world, int x, int y){
        super(world, x, y, BREED_TIME);
        setType('X');
        starving = 0;
        ID = i;
        i++;
    }
    
    @Override
    public void Move(){
//        System.out.println("Trying to move doodlebug");
        //pick direction
        int newX = x + World.getRandom(-1,1);
        int newY = y + World.getRandom(-1,1);
        boolean antEaten = false;
        //if(point exists && point is empty)
            //set x and y to newX and newY, also use world.setAt(newX, newY, this)
        if(starving<=STARVE_TIME){
            if(world.pointExists(newX,newY)){
                if(world.pointIsFree(newX, newY)){
                    //can move
    //                System.out.println("Moving doodlebug to new spot");
                    world.changePosition(newX, newY, this);
                }else if(world.getBugs()[newX][newY].getType()=='A'){
                    //there is an ant
//                    System.out.println("Doodlebug #" + ID + " ate an ant"); 
                   starving = 0;
//                    System.out.println("starving: " + starving);
                    world.changePosition(newX, newY, this);
                    antEaten = true;
                }else{
                    //there is a doodlebug
                }
            }else{
                //can't move there
            }
        }else if(starving > STARVE_TIME){
            //starved to death
//            System.out.println("Bug #" + ID + " Starved to death");
//            System.out.println("starving: " + starving);
            world.die(this);
        }
        if(antEaten)
            starving = 0;
        else
            starving++;
    }
    
    @Override
    public void simulate(){
        super.simulate();
        Move();
        Breed();
    }
    
    @Override
    public String toString(){
        return ("doodlebug");
    }
    
    @Override
    public void Breed(){
        boolean bred = false;
        if(stepsTaken%BREED_TIME==0){
            //pick a random adjacent spot and make a new organism
            if(world.pointExists((x+1), y)){
                //move right
                if(world.pointIsFree((x+1), y)){
                    //breed
                    Doodlebug newBug = new Doodlebug(world, (x+1), y);
                    world.addBugs(newBug, (x+1), y);
                    bred = true;
                }else{
                    
                }
            }
            if(bred == false){
                if(world.pointExists((x-1),y)){
                    //move left
                    if(world.pointExists((x-1), y)){
                        Doodlebug newBug = new Doodlebug(world, (x-1), y);
                        world.addBugs(newBug, (x-1), y);
                    }
                }
            }    
            if(bred == false){
                if(world.pointExists(x,(y+1))){
                    //move left
                    if(world.pointExists(x, (y+1))){
                        Doodlebug newBug = new Doodlebug(world, x, (y+1));
                        world.addBugs(newBug, x, (y+1));
                    }
                }
            }    
            if(bred == false){
                if(world.pointExists(x,(y-1))){
                    //move left
                    if(world.pointExists(x, (y-1))){
                        Doodlebug newBug = new Doodlebug(world, x, (y-1));
                        world.addBugs(newBug, x, (y-1));
                    }
                }
            } 
        }
    }
}
