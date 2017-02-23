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
public class Ant extends Organism{
    private static final int BREED_TIME = 3;
    
    public Ant(World world, int x, int y) {
        super(world, x, y, BREED_TIME);
        setType('A');
    }
    
    @Override
    public void simulate(){
        super.simulate();
        Move();
        Breed();
    }
    
    @Override
    public String toString(){
        return ("ant");
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
                    Ant newBug = new Ant(world, (x+1), y);
                    world.addBugs(newBug, (x+1), y);
                    bred = true;
                }else{
                    
                }
            }
            if(bred == false){
                if(world.pointExists((x-1),y)){
                    //move left
                    if(world.pointExists((x-1), y)){
                        Ant newBug = new Ant(world, (x-1), y);
                        world.addBugs(newBug, (x-1), y);
                    }
                }
            }    
            if(bred == false){
                if(world.pointExists(x,(y+1))){
                    //move left
                    if(world.pointExists(x, (y+1))){
                        Ant newBug = new Ant(world, x, (y+1));
                        world.addBugs(newBug, x, (y+1));
                    }
                }
            }    
            if(bred == false){
                if(world.pointExists(x,(y-1))){
                    //move left
                    if(world.pointExists(x, (y-1))){
                        Ant newBug = new Ant(world, x, (y-1));
                        world.addBugs(newBug, x, (y-1));
                    }
                }
            } 
        }
    }
}
