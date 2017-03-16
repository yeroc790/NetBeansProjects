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
public class Airplane {
    //first term determines row, second determines column
    char[][] plane = new char[7][5];    // 1 A B C D
    //char[1][0] = 2                    // 2 A B C D
                                        // . . . . .
    
    public Airplane(){
        for (int i = 0; i < 7; i++) { //rows: i
            for (int j = 0; j < 5; j++) { //columns: j
                if(j==0)
                    plane[i][j] = (char) (i + 48 + 1); //48 converts from ascii value, 1 fixes the off by 1 bug
                else
                    plane[i][j] = (char) (j + 64);
            }
        }
//        plane[1][3] = 'X'; //2C = X
    }
    
    public static String getInput(){
        Scanner input = new Scanner(System.in);
        boolean error = false;
        String seat = "";
        
        do{
            System.out.println("Please enter a seat number:");
            System.out.println("(Rows: 1-7, Seats: A-D, eg. 3C)");
            if(input.hasNextLine()){
                seat = input.nextLine();
                if(seat.length()!=2){
                    System.out.println("Invalid input, try again");
                    error = true;
                }else{
                    error = false;
                }
            }
        }while(error==true);
        return seat;
    }
    
    /**
     * Returns true if you were able to reserve the seat, false if it's taken
     * @param seat String of length 2, in the form of what is in the 'plane' array, eg. 2C
     * @return 
     */
    public boolean chooseSeat(String seat){
        char row = 0, col = 0;
        int i, j;
        
        if(seat.length()!=2){
            System.out.println("Invalid argument");
            System.exit(0);
        }else{
            row = seat.charAt(0);
            col = seat.charAt(1);
        }
        
        i = (int) row - 48 - 1;
        j = (int) col - 64;
        
        if(plane[i][j]=='X'){
            //seat is taken
            return false;
        }else{
            //seat is free
            plane[i][j] = 'X';
            return true;
        }
    }
    
    public void displayAirplane(){
        System.out.println("\n-- Available Seats --");
        for (int i = 0; i < 7; i++) {
            System.out.print("   ");
            for (int j = 0; j < 5; j++) {
                System.out.print(plane[i][j] + " ");
            }
            System.out.println();
        }
    }
}
