/*
 * This program calculates how many hours, minutes, and seconds = 50,391 seconds
 * It should equal 13hr, 59min, 51s
 */
package project7;

/**
 *
 * @author hansenc
 */
public class project7 {
    public static void main(String[] args) {
        double num = 50391; //sec
        double num_copy = num;
        double num_minutes;
        double num_minutes_copy;
        double num_secs;
        double num_hours;
        
        num_minutes = num_copy/60;             
        num_minutes = Math.floor(num_minutes); //num_minutes*60 subtracted from num = num_secs
        num_secs = num - (num_minutes*60); //working
        
        num_minutes_copy = num_minutes;
        num_hours = num_minutes_copy/60;
        num_hours = Math.floor(num_hours);
        num_minutes = num_minutes - (num_hours*60);
        
        System.out.println(num + " seconds is equal to " + num_hours + " hours, " + num_minutes + " minutes, and " + num_secs + " seconds");
//        System.out.println("num_hours = " + num_hours);
//        System.out.println("num_minutes = " + num_minutes);
//        System.out.println("num_secs = " + num_secs);
    }
}
