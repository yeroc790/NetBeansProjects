/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean quit = false;
        
        System.out.println("This program checks for prime numbers");
        
        try{
            while(quit == false){
                System.out.println("Enter a number, enter 0 to quit");

                num = input.nextInt();
                if(num==0)
                    quit = true;
                else{
                    try{
                        isPrime(num);
                    }catch(PrimeNumberException e){
                        System.out.println(num + " is not a prime number");
                    }
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Error: Invalid Input");
            System.exit(0);
        }
    }
    
    public static void isPrime(int num) throws PrimeNumberException{
        for (int i = 2; i < num-1; i++) {
            if(num%i==0)
                throw new PrimeNumberException();
        }
        System.out.println(num + " is a prime number");
    }
}
