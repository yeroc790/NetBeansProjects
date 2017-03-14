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
public class NegativeNumberException extends Exception{
    public NegativeNumberException(){
        super("Negative numbers are not allowed");
    }
    
    public NegativeNumberException(String message){
        super(message);
    }
}
