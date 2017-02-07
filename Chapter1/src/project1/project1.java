/*
 * Calorie Converter
 *
 * Useful Conversions:
 *      Running 6 MPH   = 10 METS
 *      Basketball      = 8  METS
 *      Sleeping        = 1  MET
 *
 *      Calories/Minute = 0.0175*MET*kg
 *      1kg = 2.2lb
 *
 * Problem:
 *      150lb person runs 6MPH for 30min, basketball for 30min, sleep for 6hr.
 *      Calculate number of calories burned
 */
package project1;

/**
 *
 * @author hansenc
 */
public class project1 extends main.main{
    public static void main(String[] args)
    {
        double weight, running, basketball, sleeping, calories; //running, basketball, and sleeping are in units of calories burned
        
        weight = Math.round((150/2.2)*100.0)/100.0; //now in kg
//        System.out.println("The person weighs " + weight + "kg");
        
        running = 0.0175*10*weight*30;
        basketball = 0.0175*8*weight*30;
        sleeping = 0.0175*1*weight*60*6;
        
        calories = Math.round((running + basketball + sleeping)*100.0)/100.0;
        System.out.println("The person burned " + calories + " calories");
    }
    
}
