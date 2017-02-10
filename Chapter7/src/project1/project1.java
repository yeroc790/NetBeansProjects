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
public class project1 {
    public static void main(String[] args) {
        CashPayment cash1, cash2;
        CreditCardPayment card1, card2;
        
        cash1 = new CashPayment(25);
        cash2 = new CashPayment(6.4);
        
        card1 = new CreditCardPayment(67, "John Smith", "12/22", 123456789);
        card2 = new CreditCardPayment(82, "Jane Doe", "05/21", 987654321);
        
        cash1.paymentDetails();
        cash2.paymentDetails();
        
        card1.paymentDetails();
        card2.paymentDetails();
    }
}
