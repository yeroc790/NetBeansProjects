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
public class AlienPack
{
    private Alien[] aliens;

    public AlienPack(int numAliens){
        aliens = new Alien[numAliens];
    }

    public void addAlien(Alien newAlien, int index){
        aliens[index] = newAlien;
    }

    public Alien[] getAliens(){
        return aliens;
    }
    
    public Alien getAlien(int index){
        return aliens[index];
    }
}
