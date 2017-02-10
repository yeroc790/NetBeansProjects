/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class CreditCardPayment extends Payment{
    private String name; //name on the card
    private String exp; //expiration date
    private long number; //credit card number
    
    public CreditCardPayment(){
        super(); //call to base class default constructor
        name = "";
        exp = null;
        number = 0;
    }
    
    public CreditCardPayment(double amount, String name, String exp, long num){
        super(amount);
        this.name = name;
        this.exp = exp;
        number = num;
    }
    
    public CreditCardPayment(double amount){
        super(amount); //call to base class constructor
        getInput();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setExp(String expire){
        exp = expire;
    }
    
    public void setNumber(long num){
        number = num;
    }
    
    @Override
    public void paymentDetails(){
        System.out.println("\nThe payment of $" + this.getAmount() + " was made by a credit card");
        System.out.println("Name on Card: " + name);
        System.out.println("Card Number: " + number);
        System.out.println("Expiration date: " + exp);
    }
    
    public void getInput(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the name on the card");
        name = input.nextLine();
        
        System.out.println("Please enter the expiration date (mm/yy)");
        exp = input.nextLine();
        
        System.out.println("Please enter the credit card number");
        number = input.nextLong();
    }
}
