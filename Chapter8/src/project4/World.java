/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.Random;

/**
 *
 * @author hansenc
 */
public class World {
    public static final int NUM_ROWS = 20;
    public static final int NUM_COLS = 20;
    public static final int NUM_ANTS = 100;
    public static final int NUM_BUGS = 5;
    
    
    private Organism[][] bugs = new Organism[NUM_ROWS][NUM_COLS];
    
    /* -- Begin Constructors -- */
    public World(){
        initializeWorld();
        display();
    }
    /* -- End Constructors -- */
    
    /* -- Begin Accessors -- */
    public Organism[][] getBugs(){
        return copyArray(bugs);
    }
    /* -- End Accessors -- */
    
    /* -- Begin Mutators -- */
    public void addBugs(Organism newBug, int row, int col){
        bugs[row][col] = newBug;
    }
    /* -- End Mutators -- */
    
    /* -- Begin Other Methods -- */
    private void initializeWorld(){
        int row, col;
        if((NUM_ANTS+NUM_BUGS)<=(NUM_ROWS*NUM_COLS)){ //are there enough spots on the board?
            for (int i = 0; i < NUM_BUGS; i++) {
                row = getRandom(0,19);
                col = getRandom(0,19);

                if(bugs[row][col]==null){
                    bugs[row][col] = new Doodlebug(this, row, col);
                }else{
                    i--;
                }
            }
            for (int i = 0; i < NUM_ANTS; i++) {
                row = getRandom(0,19);
                col = getRandom(0,19);
                
                if(bugs[row][col]==null){
                    bugs[row][col] = new Ant(this, row, col);
                }else{
                    i--;
                }
            }
        }else{
            System.out.println("Fatal Error: Total number of organisms exceeds space on board");
            System.exit(0);
        }
    }
    
    private static Organism[][] copyArray(Organism[][] oldBugs){
        int length = oldBugs.length;
        Organism[][] newBugs = new Organism[length][oldBugs[0].length];
        for (int i = 0; i < length; i++) {
            System.arraycopy(oldBugs[i], 0, newBugs[i], 0, oldBugs[i].length);
        }
        return newBugs;
    }
    
    public static int getRandom(int min, int max){
        Random rand = new Random();
        int n = rand.nextInt(max+1) + min;
        return n;
    }
    
    public void display(){
        System.out.println();
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                if(bugs[row][col]==null)
                    System.out.print("0 ");
                else
                    System.out.print(bugs[row][col].getType() + " ");
            }
            System.out.println();
        }
    }
    /* -- End Other Methods -- */
    
    /* -- Begin Simulation Methods -- */
    public void simulateStep(){
        resetSimulation();
        simulate("doodlebug");
        simulate("ant");
        
        display();
    }
    
    public void resetSimulation(){
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                if(bugs[row][col]!=null)
                    bugs[row][col].resetSimulation();
            }
        }
    }
    
    public void simulate(String type){
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                if(bugs[row][col] != null && bugs[row][col].toString().equals(type))
                    bugs[row][col].simulate();
            }
        }
    }
    /* -- End Simulation Methods -- */
}
