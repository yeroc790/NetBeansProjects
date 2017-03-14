/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class array {
    public void main(String[] args) {
        int[][] a1, a2, a3;
        int num = 1, numRow, numCol, value;
        
        /* -- a1 -- */
        a1 = new int[][]{{45,50,70,100},{72,48,90},{100,200},{100,90,80,70}};
        
        /* -- a2 -- */
        a2 = new int[4][4];
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 4; cols++) {
                a2[rows][cols] = num;
                num++;
            }
        }
        
        /* -- a3 -- */
        a3 = populateArray();
        
        displayArray(a1,a2,a3);
    }
    
    public static void displayArray(int[][]... args){ //takes a variable amount of arrays
        int numArrays = args.length;
        int numRows, numCols;
        
        //loop for each array passed to the method, stored in args
        for (int array = 0; array < numArrays; array++) {
            System.out.println("\n-- Array " + (array+1) + " --");

            numRows = args[array].length;
            for (int row = 0; row < numRows; row++) {
                numCols = args[array][row].length; //checks the number of columns for each row because of jagged arrays
                for (int col = 0; col < numCols; col++) {
                    System.out.print(args[array][row][col] + "\t");
                }
                System.out.println();
            }
        }
    }
    
    public static int[][] populateArray(){
        int numRow, numCol, value;
        int[][] array;
        Scanner input = new Scanner(System.in);
        System.out.println("How many rows would you like your array to have?");
        numRow = input.nextInt();
        
        if((numRow<=0)||(numRow>20)){
            System.out.println("Invalid number");
            System.exit(0);
        }
        
        System.out.println("How many columns would you like your array to have?");
        numCol = input.nextInt();
        
        if((numCol<=0)||(numCol>20)){
            System.out.println("Invalid number");
            System.exit(0);
        }
        
        array = new int[numRow][numCol];
        
        for (int rows = 0; rows < numRow; rows++) {
            for (int cols = 0; cols < numCol; cols++) {
                System.out.println("Enter a value for a3[" + rows + "][" + cols + "]:");
                value = input.nextInt();
                array[rows][cols] = value;
            }
        }
        return array;
    }
}
