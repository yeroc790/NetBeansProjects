/*
 * This program finds the square root of n, where n is positive
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project1 {
    public static void main(String[] args) {
        int n;
        double guess, r;
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.println("Please enter a positive number");
        
        n = scannerObject.nextInt(); //gets a number to use
        
        guess = n/2; //starting guess
        
        for (int i = 0; i < 100; i++) {
            r = n/guess;
            guess = (guess+r)/2;    
        }
        
        System.out.println("The approximated square root of " + n + " is " + guess);
        
    }
}
