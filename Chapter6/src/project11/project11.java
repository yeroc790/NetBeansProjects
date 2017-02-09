/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project11 {
    public static void main(String[] args) {
        Airplane myPlane = new Airplane();
        String seat;
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        do{
            myPlane.displayAirplane();          
        
            seat = Airplane.getInput();    
            System.out.println("seat: " + seat);
            if(myPlane.chooseSeat(seat))
                System.out.println("Reservation of seat '" + seat  + "' successful");
            else
                System.out.println("Sorry, seat '" + seat + "' is already taken");
            
            System.out.println("Would you like to continue? (y or n)");
            if(input.nextLine().charAt(0)=='y'){
                quit = false;
            }else if(input.nextLine().charAt(0)=='n'){
                quit = true;
            }else{
                System.out.println("Invalid input");
                System.exit(0);
            }
            
        }while(quit==false);
    }    
}
