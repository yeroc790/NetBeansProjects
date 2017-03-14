/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project1 {
    public static void main(String[] args) {
        int N = 0, sum = 0;
        double average;
        boolean again = true;
        DecimalFormat num = new DecimalFormat("0.00");
        
        System.out.println("How many numbers would you like to take the average of?");
        while(again == true){
            try{
                N = getNum();
                again = false;
            }catch(NegativeNumberException e){
                System.out.println("Error: " + e.getMessage());
                System.out.println("Try Again");
                again = true;
            }
        }
        
        for (int i = 0; i < N; i++) {
            again = true;
            System.out.println("-- Number " + (i+1) + " --");
            System.out.println("Enter a positive number");
            while(again == true){
                try{
                    sum += getNum();
                    again = false;
                }catch(NegativeNumberException e){
                    System.out.println("Error: " + e.getMessage());
                    System.out.println("Try Again");
                    again = true;
                }
            }
        }
        
        average = sum/N;
        System.out.println("The average is " + num.format(average));
    }
    
    private static int getNum() throws NegativeNumberException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<0)
            throw new NegativeNumberException();
        else
            return n;
    }
}
