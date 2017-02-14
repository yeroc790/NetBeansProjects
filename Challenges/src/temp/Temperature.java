/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

/**
 *
 * @author hansenc
 */
public class Temperature {  
    public static double getFahrenheit(double temp){
        temp = ((9*temp)/5) + 32;
        return temp;
    }
    
    public static double getCelcius(double temp){
        temp = (5*(temp-32))/9;
        return temp;
    }
}
