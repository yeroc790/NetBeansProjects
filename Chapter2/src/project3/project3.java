/*
 * This project performs basic calculations on given ints
 */
package project3;
import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Please enter two integers, seperated by spaces");
        if(scannerObject.hasNextInt()){
            n1 = scannerObject.nextInt();
            n2 = scannerObject.nextInt();
        }else{
            System.out.println("At least one of those numbers were not integers, try again");
            n1 = 0;
            n2 = 0;
        }
        
        System.out.println("The numbers chosen are " + n1 + " and " + n2);
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
    }
}
