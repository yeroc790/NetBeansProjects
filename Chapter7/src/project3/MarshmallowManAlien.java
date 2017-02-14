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
public class MarshmallowManAlien extends Alien {
    public MarshmallowManAlien(){
        super(1);
    }
    
    public MarshmallowManAlien(int health){
        super(1,health);
    }

    @Override
    public int calculateDamage(AlienPack pack) {
        int damage = 0;
        Alien temp;
        
        for (int i = 0; i < pack.getAliens().length; i++) {
            temp = pack.getAlien(i);
            damage += temp.getDamage();
        }
        
        return damage;
    }
}
