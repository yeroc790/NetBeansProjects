/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project8;

/**
 *
 * @author hansenc
 */
public class project8 {
    public static void main(String[] args) {
        double[] b = {7.7, 5.5, 11, 3, 16, 4.4, 20, 14, 13, 42};
        
        System.out.println("Array contents before sorting:");
        for(double temp: b)
            System.out.print(temp + " ");
        System.out.println();
        
        BubbleSort.sort(b);
        
        System.out.println("Array contents before sorting:");
        for(double temp: b)
            System.out.print(temp + " ");
        System.out.println(); 
   }
}
