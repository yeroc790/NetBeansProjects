/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project2 {
    public static int NUM_LINES = 50;
    
    public static void main(String[] args) {
        Scanner fileIn = null;
        int[] numbers = new int[NUM_LINES];
        
        try{
            fileIn = new Scanner(new FileInputStream("src\\project2\\numbers.txt"));
        }catch(FileNotFoundException e){
            System.out.println("That file could not be found or opened");
            System.exit(0);
        }
        
        int temp = 0;
        int i = 0;
        while(fileIn.hasNextLine()){
            try{
                temp = parseInt(fileIn.nextLine());
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                System.exit(0);
            }
            if(temp>0){
                numbers[i] = temp;
                i++;
            }
        }

        int small = numbers[0];
        int large = numbers[0];
        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j]!=0){
                if(numbers[j]<small)
                    small = numbers[j];

                if(numbers[j]>large)
                    large = numbers[j];
            }
        }
        
        System.out.println("The numbers in the file range from " + small + " to " + large);
    }
}
