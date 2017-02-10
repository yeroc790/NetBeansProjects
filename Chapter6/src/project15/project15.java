/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project15;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pizza tempPizza;
        PizzaOrder myOrder = new PizzaOrder();
        int numPizzas = 0;
        double cost;
        
        System.out.println("How many pizzas would you like to order?");
        if(input.hasNextInt()){
            numPizzas = input.nextInt();
        }else{
            System.out.println("Invalid number");
            System.exit(0);
        }
        
        myOrder.setNumPizzas(numPizzas);
        
        for (int i = 0; i < numPizzas; i++) {
            tempPizza = new Pizza(i);
            myOrder.setPizza(i, tempPizza);
            tempPizza.displayPizza(i);
        }
        
        cost = myOrder.getCost();
        System.out.println("Your total cost is $" + cost);
    }
}
