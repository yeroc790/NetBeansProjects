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
public class DayException extends Exception{
    public DayException(){
        super("Not a valid day");
    }
    
    public DayException(String message){
        super(message);
    }
}
