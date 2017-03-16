/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Account acc = new Account();
        boolean quit = false, error = false;
        char x;
        double num;

        do{
            quit = false;
            System.out.println("Current Balance: $" + acc.getBalance());
            System.out.println("Enter 'd' to deposit, 'w' to withdraw, and 'q' to quit");
            do{
                x = input.next().toLowerCase().charAt(0);
                if((x!='d')&&(x!='w')&&(x!='q')){
                    error = true;
                    System.out.println("Invalid command, try again");
                }else
                    error = false;
            }while(error==true);
            
            switch(x){
                case 'd':
                    num = Account.getInput('d');
                    try{
                        acc.deposit(num);
                    }catch(NegativeAmountException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 'w':
                    num = Account.getInput('w');
                    try{
                        acc.withdraw(num);
                    }catch(NegativeAmountException e){
                        System.out.println("Error: " + e.getMessage());
                    }catch(OverdrawException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 'q':
                    quit = true;
                    break;
            }
        }while(quit==false);
    }
}
