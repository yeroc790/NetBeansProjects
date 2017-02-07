/*
 * 
 */
package project4;

/**
 *
 * @author hansenc
 */
public class project4 {
    public static void main(String[] args) {
        final double LETHAL_MOUSE = 0.2; //ounces of sweetener to kill a mouse
        final double WEIGHT_MOUSE = 0.7; //weight in ounces
        final double STARTING_WEIGHT = 3174; //weight in ounces, 200lb
        final double END_WEIGHT = 2469; //weight in ounces, 150lb
        final double PERCENTAGE = 0.001; //percent of sweetener in 1 diet soda
        final double SODA = 8; //oz in a can of soda
        
        
        double lethal_human = (END_WEIGHT*LETHAL_MOUSE)/WEIGHT_MOUSE;
        double dose = SODA*PERCENTAGE; //amount of sweetener in 1 can of soda

        double lethal_soda = lethal_human/dose; //number of soda cans
        lethal_soda = Math.round(lethal_soda);
        System.out.println("The maximum number of diet sodas your friend can drink without dying is " + lethal_soda);
    }
}
