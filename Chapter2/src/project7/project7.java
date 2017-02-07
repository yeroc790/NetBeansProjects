/*
 * This application determines the amount of change to be given 
 * when an item of cost ranging from 25 cents to 1 dollar in 5 cent increments
 * is purchased with a one dollar bill
 */
package project7;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price; //price of item in cents
        int change; //change due in cents
        int change_c; //copy
        int quarters = 0; //number of quarters
        int dimes = 0; //number of dimes
        int nickels = 0; //number of nickels
        
        System.out.println("Please enter the price of the item in cents ranging from 25 to 100, in 5 cent increments");
        if(input.hasNextInt())
        {
            price = input.nextInt();
        }else{
            System.out.println("Invalid input");
            price = 0;
        }
        
        change = 100 - price;
        change_c = change;
        System.out.println("Your change is " + change + " cents");
        if(change_c-25>=0)
        {
            do{
                if(change_c-25>=0){
                    change_c -= 25;
                    quarters++;
                }else{
                    break;
                }
            }while(change_c>0);
        }
        change -= 25*quarters;        
        change_c = change;
       
        if(change_c-10>=0)
        {
            do{
                if(change_c-10>=0)
                {
                    change_c -= 10;
                    dimes++;
                }else{
                    break;
                }
            }while(change_c>0);
        }
        
        change -= 10*dimes;
        change_c = change;
        
        if(change_c-5>=0)
        {
            do{
                if(change_c-5>=0)
                {
                    change_c -= 5;
                    nickels++;
                }else{
                    break;
                }
            }while(change_c>0);
        }
        
        change -= 5*nickels;
        
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
    }
}
