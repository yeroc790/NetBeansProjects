/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

/**
 *
 * @author hansenc
 */
public class OverdrawException extends Exception{
    public OverdrawException(){
        super("You cannot withdraw more than you have in your balance");
    }
    
    public OverdrawException(String message){
        super(message);
    }
}
