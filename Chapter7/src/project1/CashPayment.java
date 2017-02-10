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
public class CashPayment extends Payment {
    public CashPayment(){
        super(); //call to base class default constructor
    }
    
    public CashPayment(double amount){
        super(amount); //call to base class constructor
    }
    
    @Override
    public void paymentDetails(){
        System.out.println("\nThe payment of $" + this.getAmount() + " was received in cash");
    }
}
