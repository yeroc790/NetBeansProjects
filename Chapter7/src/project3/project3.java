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
public class project3 {
    public static void main(String[] args) {
        int damage;
        
//        Alien test = new Alien() {};
        SnakeAlien snake = new SnakeAlien();
        OgreAlien ogre = new OgreAlien();
        MarshmallowManAlien steve = new MarshmallowManAlien();

        AlienPack pack = new AlienPack(3);
        pack.addAlien(snake,0);
        pack.addAlien(ogre,1);
        pack.addAlien(steve, 2);
        
        damage = snake.calculateDamage(pack);
        System.out.println("Total damage: " + damage);
    }
}
