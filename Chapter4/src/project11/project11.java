/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project11 {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza();
        Scanner input = new Scanner(System.in);
        int cost;
        
        System.out.println("Please enter the size (s, m, or l)");
        myPizza.setSize(input.next().charAt(0));
        
        System.out.println("Please enter a character for each topping you want");
        System.out.println("o: Olives");
        System.out.println("p: Pineapples");
        System.out.println("s: Sausage");
        System.out.println("j: Jalepenos");
        System.out.println("m: Mushrooms\n");
        myPizza.setToppings(input.next());
        
        myPizza.displayPizza();
        
        cost = myPizza.getCost();
        System.out.println("Your pizza will cost $" + cost);
    }
}
