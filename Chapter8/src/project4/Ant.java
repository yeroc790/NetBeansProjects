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
}
