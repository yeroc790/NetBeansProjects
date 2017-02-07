/*
 * This application calculates the inflation cost of an item for a fixed amount of years
 */
package project4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price, inflation;
        int amount, years;
        
        System.out.println("Please enter the price of the item you would like to buy");
        price = input.nextFloat();
        System.out.println("Please enter the number of items you'd like to purchase");
        amount = input.nextInt();
        System.out.println("Please enter the number of years from now the item will be purchased (only whole numbers are accepted)");
        years = input.nextInt();
        System.out.println("Plese enter the rate of inflation as a percent");
        inflation = input.nextFloat();
        inflation /= 100; //converting inflation to decimal (45% to 0.45)
        
        for(int i=0; i<years; i++)
        {
            price += price*inflation;
        }
        price *= amount;
        DecimalFormat dollar = new DecimalFormat("0.00");
        System.out.println("The price for " + amount + " items would be $" + dollar.format(price) + " in " + years + " years");
    }
}
