/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author hansenc
 */
public class project4 {
    public static void main(String[] args) {
        Administrator admin = new Administrator("Bill Smith", "12/5/2005", 52000);
        
        String display = admin.toString();
        System.out.println(display);
    }
}
