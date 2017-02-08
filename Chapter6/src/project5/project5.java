/*
 * Calculating the standard deviation
 * eg. sd of n1, n2, and n3:
 * sqrt(((n1 - a)^2 + (n2 - a)^2 + (n3 - a)^2)/3)
 * where 'a' is the average of n1, n2, and n3
 */
package project5;

import java.text.DecimalFormat;

/**
 *
 * @author hansenc
 */
public class project5 {
    public static void main(String[] args) {
        double[] a = new double[30]; //the main array
        double[] b = {9,2,5,4,12,7,8,11,9,3,7,4,12,5,4,10,9,6,9,4}; //for the sake of time, instead of running user input, I set it here
        
        int size = b.length;
        
        //copying the array, however, a still has extra slots
        for (int i = 0; i < size; i++) 
            a[i] = b[i];
        
        project5.displaySD(b, size);
    }
    
    public static double StandardDeviation(double[] a, int size){ 
        double sd = 0; //standard deviation
        double average = 0;
        
        /* Finding the average of the elements in 'a' */
        for(double temp: a)
            average += temp; 
        average /= size;
        
        /* Next step */
        for(double temp: a){
            sd += Math.pow((temp - average),2); //(n1 - a)^2 + ...
        }
        sd /= size;
        sd = Math.sqrt(sd); //now complete
        
        return sd;
    }
    
    public static void displaySD(double[] a, int size){
        DecimalFormat round = new DecimalFormat("0.000");
        double sd = StandardDeviation(a, size);
        
        System.out.println("The standard deviation of the following numbers:");
        for(double temp: a)
            System.out.print(temp + " ");
        System.out.println("\nis " + round.format(sd));
    }
}
