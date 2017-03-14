/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

/**
 *
 * @author hansenc
 */
public class MonthException extends Exception{
    public MonthException(){
        super("Not a valid month");
    }
    
    public MonthException(String message){
        super(message);
    }
}
