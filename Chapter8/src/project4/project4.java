/*
 * TODO: Delete Doodlebug after starving to death
 * 
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
 *
 *
 * NOTE: This code is heavily inspired by GitHub user 'rgerstenberger', I got stuck and had to restart my code, and I used his as an example of a way to set up the class
 * https://github.com/rgerstenberger/Doodlebugs_Java/tree/master/src
 */
package project4;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project4 {
    public static void main(String[] args) {
        System.out.println("\n-- Initial --");
        boolean quit = false;
        Scanner input = new Scanner(System.in);
        int num, timesteps = 1;
        int[] numOrganisms;
        World world = new World();
        
//        for(int i = 0; i < 10; i++){
        do{
            System.out.println("\n-- Timestep " + timesteps + " --");
            world.simulateStep(); //nothing is changing for each simulation
            numOrganisms = world.checkNumbers();
            System.out.println("\nNumber of Ants: " + numOrganisms[0]);
            System.out.println("Number of Doodlebugs: " + numOrganisms[1]);
            System.out.println("\nEnter 0 to stop, enter any number to continue");
            num = input.nextInt();
            if(num==0){
                quit=true;
            }else{
                quit=false;
            }
            timesteps++;
        }while(quit == false);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(World.getRandom(-1,1));
//        }
    }
}
