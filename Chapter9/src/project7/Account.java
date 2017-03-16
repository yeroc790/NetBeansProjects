/*
 * Already written code, but the methods return -1 instead of throwing errors to indicate invalid information
 * The project is to rewrite it
 */
package project7;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class Account {
    private double balance;
    private static Scanner input = new Scanner(System.in);
    
    public Account(){
        balance = 0;
    }
    
    public Account(double initialDeposit){
        balance = initialDeposit;
    }
    
    public double getBalance(){
        return balance;
    }
    
    //returns new balance or -1 if error
    public double deposit(double amount) throws NegativeAmountException{
        if(amount>0)
            balance += amount;
        else
            throw new NegativeAmountException();
        return balance;
    }
    
    //returns new balance or -1 if invalid amount
    public double withdraw(double amount) throws OverdrawException, NegativeAmountException{
        if(amount>balance)
            throw new OverdrawException();
        else if(amount<0)
            throw new NegativeAmountException();
        else
            balance -= amount;
        return balance;
    }
    
    public static double getInput(char operation){
        double num;
        
        if(operation=='w'){
            System.out.println("How much would you like to withdraw?");
            num = input.nextDouble();
        }else if(operation=='d'){
            System.out.println("How much would you like to deposit?");
            num = input.nextDouble();
        }else{
            System.out.println("Unknown operation");
            return 0;
        }
        return num;
    }
}
