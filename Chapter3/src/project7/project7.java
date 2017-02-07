/*
 * This application calculates the value of e raised to a power x
 * The formula: e^x = 1 + x + (x^2/2!) + (x^3/3!) + ... + (x^n/n!)
 * The program lets the user choose x, and uses 1-10, 50, and 100 as values for n
 * The program loops until the user chooses to quit
 *
 * Math.pow(2, 3): 8
 */
package project7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, n;
        float e=0, num; //factorial needs to be changed to type BigInteger
        double factorial = 1;
        DecimalFormat integer = new DecimalFormat("0");
        DecimalFormat euler = new DecimalFormat("0.0000000000");
        
        System.out.println("Please enter the number you would like to raise e to the power of:");
        x = input.nextInt();
        
        //n = 1-10
//        for (int i = 1; i <= 5; i++) { // change max to 10
//            n = i;
//            System.out.println("-- n = " + i + " --");
//            for (int j = 1; j <= n; j++) { // finds 1 + x + ..., so there are n terms
//                for (int k = 1; k <= n; k++) { //determines factorial
//                    factorial *= k;
//                }
//                System.out.println(j + "!: " + factorial);
//                num = (float) ((Math.pow(x, j))/factorial); 
//                System.out.println("num(" + j + "): " + num);
//                
//                factorial = 1;
//            }
//            System.out.println(" ");
//        }
        for(int k = 1; k<=10; k++) // k is the value of n, and it ranges from 1 - 10
        {
            for (int i = 0; i <= k; i++) { //term 0: 1, term 1: x, term 2: x^2/2!, term n: x^n/n! 
                // num = x^i/i!
                for (int j = 1; j <= i; j++) { //determines i!
                    if(i==0){
                        factorial = 1;
                    }else{
                        factorial *= j;
                    }
                }

                num = (float) (Math.pow(x,i)/factorial);
                e += num;
                factorial = 1;
            }
            System.out.println("\n-- For n = " + k + " --");
            System.out.println("e^x: " + euler.format(e));
            e = 0; //reset for other values of n
        }
        

        //n = 50
        for (int i = 0; i <= 50; i++) { //term 0: 1, term 1: x, term 2: x^2/2!, term n: x^n/n! 
            // num = x^i/i!
            for (int j = 1; j <= i; j++) { //determines i!
                if(i==0){
                    factorial = 1;
                }else{
                    factorial *= j;
                }
            }
            
            num = (float) (Math.pow(x,i)/factorial);
            e += num;
            factorial = 1;
        }
        System.out.println("\n-- For n = 50 --");
        System.out.println("e^x: " + euler.format(e));
        e = 0; //reset for other values of n
        
        //n = 100
        for (int i = 0; i <= 100; i++) { //term 0: 1, term 1: x, term 2: x^2/2!, term n: x^n/n! 
            // num = x^i/i!
            for (int j = 1; j <= i; j++) { //determines i!
                if(i==0){
                    factorial = 1;
                }else{
                    factorial *= j;
                }
            }
            
            num = (float) (Math.pow(x,i)/factorial);
            e += num;
            factorial = 1;
        }
        System.out.println("\n-- For n = 100 --");
        System.out.println("e^x: " + euler.format(e));
    }
}
