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
public class OgreAlien extends Alien{
    public OgreAlien(){
        super(6);
    }
    
    public OgreAlien(int health){
        super(6,health);
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
