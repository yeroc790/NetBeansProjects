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
public class YearException extends Exception{
    public YearException(){
        super("Not a valid year");
    }
    
    public YearException(String message){
        super(message);
    }
}
