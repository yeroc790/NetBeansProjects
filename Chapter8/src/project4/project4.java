/*
 * This is a 2D predator-prey simulator
 * The board is 20x20
 * The prey is ants, the predators are doodlebugs
 * Ants can 
 *      Move: randomly try to move up, down, left, or right, if occupied, don't move
 *      Breed: if an ant survives for three time steps, at the end of the third step, ie after moving, it will creat a new ant in an adjacent cell that is empty
 *
 * Doodlebugs can
 *      Move: Same rules as ant, but if a tile is occupied by an ant, the doodlebug will take the spot and eat the ant
 *      Breed: same as ant except after 8 time steps
 *      Starve: if after 3 time steps the doodlebug has not eaten an ant, it will starve and die
 * 
 * Each turn the doodlebugs move before the ants
 * 'a' for ant, 'X' for doodlebug, '0' for empty
 * 
 * class Organism has the methods that are common between ants and doodlebugs
 * 
 * world starts with 5 doodlebugs and 100 ants
 * 
 * user controls the time steps by pressing ENTER
 */
package project4;

/**
 *
 * @author hansenc
 */
public class project4 {
    public static void main(String[] args) {
        Doodlebug bug[] = new Doodlebug[5]; //5 bugs
        Ant ant[] = new Ant[100]; //100 ants
        
        for (int i = 0; i < 100; i++) { //testing
            ant[i] = new Ant();
        }
        
        for (int i = 0; i < 5; i++) {
            bug[i] = new Doodlebug();
        }
        
        
        
        Organism.populateBoard(bug, ant); //100 ants, 5 bugs  
        Organism.displayBoard();
        
        //EVERY TIME AN ANT IS EATEN, AN X ON THE GRAPH DISAPPEARS, NUMBUGS IS FINE, HOWEVER
        
        for (int moves = 0; moves < 10; moves++) {
            System.out.println("\n-- Time step: " + (moves+1) + " --");
            System.out.println("-- NumBugs: " + Organism.getNumBugs() + " --");
            System.out.println("-- NumAnts: " + Organism.getNumAnts() + " --");
            for (int i = 0; i < 5; i++) {
                if(bug[i].isNotDead())
                    bug[i].move();
            }
            for (int i = 0; i < 100; i++) {
                if(ant[i].isNotDead())
                    ant[i].move();
            }
            Organism.displayBoard();
        }
        
        System.out.println("-- Final Display --");
        System.out.println("-- NumBugs: " + Organism.getNumBugs() + " --");
        System.out.println("-- NumAnts: " + Organism.getNumAnts() + " --");
        Organism.displayBoard();
    }
}
