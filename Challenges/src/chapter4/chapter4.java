/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class chapter4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicles car1 = new Vehicles("Toyota","Red");
        Vehicles car2;
        double dist, time, diff;
        
        
        System.out.println("\nInfo for car 2");
        car2 = new Vehicles();
        
        System.out.println("Please enter the distance driven:");
        dist = input.nextDouble();
        
        System.out.println("Please enter the time driven:");
        time = input.nextDouble();
        
        System.out.println("Please enter how much faster car 2 was driving (it can be negative) (x + diff = y)");
        diff = input.nextDouble();
        
        car1.findSpeed(car2, dist, time, diff);
        car1.display(car2);
    }
}
