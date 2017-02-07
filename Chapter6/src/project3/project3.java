/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author hansenc
 */
public class project3 {
    public static void main(String[] args) {
        Rainfall rain = new Rainfall();
        
        double[] a = {1.8,2.6,11.4,12.6,5.3,2.2,0.2,9.7,2.4,1.1,3.2,4.1};
        rain.setAverageRain(a);
        rain.setActualRain(); 
        rain.displayRainfall(); //need to change display to a table format
    }
}
