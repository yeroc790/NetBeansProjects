/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import java.text.DecimalFormat;

/**
 *
 * @author hansenc
 */
public class temp {
    public static void main(String[] args) {
        double cTemp = 25;
        double fTemp = 79;
        DecimalFormat round = new DecimalFormat("0.00");
        
        System.out.println("\nTemperature 1:");
        System.out.println(cTemp + " degrees Celcius");
        System.out.println(round.format(Temperature.getFahrenheit(cTemp)) + " degrees Fahrenheit");
        
        System.out.println("\nTemperature 2:");
        System.out.println(fTemp + " degrees Fahrenheit");
        System.out.println(round.format(Temperature.getCelcius(fTemp)) + " degrees Celcius");
    }
}
