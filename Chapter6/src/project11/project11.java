/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;

/**
 *
 * @author hansenc
 */
public class project11 {
    public static void main(String[] args) {
        Airplane myPlane = new Airplane();
        myPlane.displayAirplane();
        
        if(myPlane.isTaken("2C"))
            System.out.println("2C is taken yo");
        else
            System.out.println("Oh, 3A is free");
        
        if(myPlane.isTaken("3A"))
            System.out.println("3A is taken yo");
        else
            System.out.println("Oh, 3A is free");
    }
}
