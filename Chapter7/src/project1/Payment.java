/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author hansenc
 */
public class Payment {
    private double amount; //amount of payment
    
    public Payment(){
        amount = 0;
    }
    
    public Payment(double num){
        if(num<0){
            System.out.println("Invalid number");
            System.exit(0);
        }else
            amount = num;
    }
    
    public void setAmount(double num){
        if(num<0){
            System.out.println("Invalid number");
            System.exit(0);
        }else
            amount = num;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public void paymentDetails(){
        System.out.println("The payment of $" + amount + " was received");
    }
}
