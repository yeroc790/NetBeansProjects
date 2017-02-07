/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project9;

/**
 *
 * @author hansenc
 */
public class project9 {
    public static void main(String[] args) {
            Animals tiger, lion, gorilla, buffalo, zebra, mystery;
            tiger = new Animals("Tiger", 5335, -0.5);
            lion = new Animals("Lion", 14528, 0.7);
            gorilla = new Animals();
            buffalo = new Animals("Buffalo", 1396, -0.8);
            zebra = new Animals("Zebra", 305389, 0.9);
            mystery = new Animals("Tiger", 5335, -0.5);
            
            gorilla.setSpecies("Gorilla");
            gorilla.setPop(3582);
            gorilla.setGrowth(-0.3);
            
            if(tiger.equals(mystery)){
                System.out.println("The mystery animal is a tiger");
            }
            
            zebra.displayAnimal();
            
            if(buffalo.endangered()){
                System.out.println("The buffalo is endangered");
            }
            
    }
}
