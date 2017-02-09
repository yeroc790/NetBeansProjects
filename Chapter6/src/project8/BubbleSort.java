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
public class BubbleSort {
    /**
     * This method is for a partially filled array
     * @param a Partially filled array of doubles
     * @param numberUsed Number of elements in the array
     * @return 
     */
    public static void sort(double[] a, int numberUsed){
        boolean swapped;
        
        do{
            swapped = false;
            for (int i = 0; i < numberUsed; i++) {
                if((i+1)!=numberUsed){
                    if(a[i]>a[i+1]){
                        swap(i,i+1,a);
                        swapped = true;
                    }
                }
            }
        }while(swapped==true);   
    }
    
    /**
     * This method is for a filled array
     * @param a Filled array of doubles
     * @return 
     */
    public static void sort(double[] a){
        boolean swapped;
        
        do{
            swapped = false;
            for (int i = 0; i < a.length; i++) {
                if((i+1)!=a.length){
                    if(a[i]>a[i+1]){
                        swap(i,i+1,a);
                        swapped = true;
                    }
                }
            }
        }while(swapped==true);  
    }
    
    /**
     * Precondition: i and j are legal indices for the array a.
     * @param i index for first number
     * @param j index for second number
     * @param a array of doubles
     */
    private static void swap(int i, int j, double[] a){
        double temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    //testing stuff
    public static void changeInt(int[] i){
        i[0] = 42;
    }
}
