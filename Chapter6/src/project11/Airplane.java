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
        plane[1][3] = 'X'; //2C = X
    }
    
    public boolean isTaken(String seat){ //eg 2C
        char row = 0, col = 0;
        int i, j;
        
        if(seat.length()!=2){
            System.out.println("Invalid argument");
            System.exit(0);
        }else{
            row = seat.charAt(0); // eg 2, which means i = 1
            col = seat.charAt(1); // eg C, which means j = 3
        }
        
        i = (int) row - 48 - 1; //yet again, off by one bug
        j = (int) col - 64;
        
        if(plane[i][j]=='X')
            return true;
        else
            return false;
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
