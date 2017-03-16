/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

/**
 *
 * @author hansenc
 */
public class DivisionByZeroException extends Exception{
    public DivisionByZeroException(){
        super("Division by zero is undefined");
    }
    
    public DivisionByZeroException(String message){
        super(message);
    }
}
