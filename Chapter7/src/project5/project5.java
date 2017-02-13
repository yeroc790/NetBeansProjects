/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

/**
 *
 * @author hansenc
 */
public class project5 {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Bill Smith", "12/5/2005", 152000);
        
        String display = doc.toString();
        System.out.println(display);
    }
}
