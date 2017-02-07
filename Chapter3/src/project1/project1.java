/*
 * This application calculates the sqare root of a given number
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        float r, guess, newGuess;
        
        System.out.println("Please enter a positive integer");
        num = input.nextInt();
        
        guess = num/2;
        
        for (int i = 0; i < 100; i++) {
            r = num/guess;
            guess = (guess + r)/2;
        }
        System.out.println("The approximate square root of " + num + " is " + guess);
    }
}
