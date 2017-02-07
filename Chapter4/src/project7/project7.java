/*
 * This project demonstrates a class named Temperature
 * the class project7 uses Temperature
 */
package project7;

/**
 *
 * @author hansenc
 */
public class project7 {
    public static void main(String[] args) {
        Temperature myTemp, yourTemp;
        myTemp = new Temperature(37,'c');
        yourTemp = new Temperature(51,'f'); //yourTemp is overriding myTemp value
        
        System.out.println("-- My Temp --");
        myTemp.displayTemp();
        
        System.out.println("-- Your Temp --");
        yourTemp.displayTemp();
        
        if(myTemp.isGreater(yourTemp)){
            System.out.println("My temp is greater than your temp");
        }else if(myTemp.isLess(yourTemp)){
            System.out.println("My temp is less than your temp");
        }else if(myTemp.equals(yourTemp)){
            System.out.println("Our temps are equal");
        }else{
            System.out.println("There was an error");
        }
    }
}
