/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project5 {
    public static void main(String[] args) {
        double d, p, s; //depreciation, purchase price, salvage value
        int y; //years
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the purchase price of your item:");
        System.out.print("$");
        p = scanner.nextDouble();
        
        System.out.println("Please enter the expected number of years the product will be used");
        y = scanner.nextInt();
        
        System.out.println("Please enter the expected salvage value");
        System.out.print("$");
        s = scanner.nextDouble();
        
        d = (p-s)/y;
        
        System.out.println("The depreciation value is $" + d);
    }
}
