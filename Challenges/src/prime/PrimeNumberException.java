/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author hansenc
 */
public class PrimeNumberException extends Exception{
    public PrimeNumberException(){
        super("Not a prime number");
    }
    
    public PrimeNumberException(String message){
        super(message);
    }
}
