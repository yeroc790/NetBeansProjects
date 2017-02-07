/*
 * This application is like a modified Fibonacci series
 * The green crud population repopulates every 5 days
 * Basically, amount = starting amount* the right fibonacci number
 * Eg. Starting with 10 pounds, after 5 days, 10, after 10, 10, after 15, 20, after 20, 30...
 * every 5 days its the next fibonacci number
 */
package project6;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=1, num2=1, num3 = 0, amount, days;
        double iterations;
        
        System.out.println("What is the starting amount of the organism?");
        amount = input.nextInt();
        System.out.println("How many days would you like to calculate?");
        days = input.nextInt();
        
        iterations = Math.floor(days/5);
        
        if(iterations==1)
        {
            amount = amount; //nothing happens
        }else{
            for(int i=0;i<(int)iterations - 1;i++)
            {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
            amount *= num3;
        }
            
        System.out.println("The amount of the organism after " + days + " days is " + amount + " pounds");    
        
    }
}
