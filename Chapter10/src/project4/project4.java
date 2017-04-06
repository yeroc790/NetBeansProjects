/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.Double.parseDouble;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project4 {
    public static void main(String[] args) {
        Scanner input = null;
        double[] numbers = null;
        int num = 0;
        DecimalFormat round = new DecimalFormat("0.00");
        
        /* -- Getting number of lines in file -- */
        try{
            input = new Scanner(new FileInputStream("src\\project4\\numbers.txt"));
        }catch(FileNotFoundException e){
            System.out.println("Could not open file");
            System.exit(0);
        }
        String temp;
        while(input.hasNextLine()){
            temp = input.nextLine();
            num++;
        }
        input.close();
        /* -- End of Process -- */
        
        //setting up numbers array
        numbers = new double[num];
        
        /* -- Populating 'numbers' -- */
        try{
            input = new Scanner(new FileInputStream("src\\project4\\numbers.txt"));
        }catch(FileNotFoundException e){
            System.out.println("Could not open file");
            System.exit(0);
        }
        
        System.out.println("\n-- List of Numbers --");
        int i = 0;
        while(input.hasNextLine()){
            temp = input.nextLine();
            numbers[i] = parseDouble(temp);
            System.out.println(numbers[i]);
            i++;
        }
        input.close();
        /* -- End of Process -- */
        
        /* -- Finding the Average -- */
        double average = 0;
        for(double x : numbers){
            average += x;
        }
        average /= numbers.length;
        System.out.println("\nThere are " + numbers.length + " numbers");
        System.out.println("Average: " + round.format(average));
        /* -- End of Process -- */
        
        // Standard Deviation = SQRT([(n1 - a)^2 + (n2 - a)^2 + ... + (n - a)^2]/2)
        
        /* -- Finding Standard Deviation -- */
        double sd = 0;
        double sum = 0;
        
        
        //finding average of: (n1 - a)^2
        for(double x : numbers){
            sum += Math.pow((x - average), 2);
        }
        sum /= numbers.length;
        
        sd = Math.sqrt(sum);
        
        System.out.println("The standard deviation of the list is " + round.format(sd));
    }
}
