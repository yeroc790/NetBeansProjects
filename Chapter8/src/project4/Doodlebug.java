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
    private int starving = 0; //if starving == STARVE_TIME, it dies
    
    public Doodlebug(World world, int x, int y){
        super(world, x, y, BREED_TIME);
        setType('X');
    }
    
    @Override
    public void Move(){
//        System.out.println("Trying to move doodlebug");
        //pick direction
        int newX = x + World.getRandom(-1,1);
        int newY = y + World.getRandom(-1,1);
        
        //if(point exists && point is empty)
            //set x and y to newX and newY, also use world.setAt(newX, newY, this)
        if(starving<STARVE_TIME){
            if(world.pointExists(newX,newY)){
                if(world.pointIsFree(newX, newY)){
                    //can move
    //                System.out.println("Moving doodlebug to new spot");
                    world.changePosition(newX, newY, this);
                    starving++;
                }else if(world.getBugs()[newX][newY].getType()=='A'){
                    //there is an ant
    //                System.out.println("Doodlebug ate an ant");
                    world.changePosition(newX, newY, this);
                    starving = 0;
                }else{
                    //there is a doodlebug
                    starving++;
                }
            }else{
                //can't move there
            }
        }else{
            //starved to death
        }
    }
    
    @Override
    public void simulate(){
        super.simulate();
        Move();
    }
    
    @Override
    public String toString(){
        return ("doodlebug");
    }
}
