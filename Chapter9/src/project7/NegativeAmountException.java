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
public class NegativeAmountException extends Exception{
    public NegativeAmountException(){
        super("Negative numbers are not valid");       
    }
    
    public NegativeAmountException(String message){
        super(message);
    }
}
