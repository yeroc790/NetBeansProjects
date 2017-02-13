/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

/**
 *
 * @author hansenc
 */
public class project6 {
    public static void main(String[] args) {
        Person joe = new Person("Joe Smith");
        Truck ford = new Truck("Ford", 6, joe, 0.5, 300);
        
        String display = ford.toString();
        System.out.println(display);
    }
}
