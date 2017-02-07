/*
 * This is a modified version of Chapter 2 project 11
 * Instead of having to grade a fixed amount of assignments, it takes a variable
 */
package project9;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many assignments would you like to grade?");
        int NUM_PROJECTS = input.nextInt();
        
        String[] name = new String[NUM_PROJECTS];
        int[] score = new int[NUM_PROJECTS];
        int[] totalScore = new int[NUM_PROJECTS];
        int num_spaces;
        String spaces = "";
        input.useDelimiter("\n");
        int total = 0, max = 0;
        double ratio;
        
        for (int i = 1; i <= NUM_PROJECTS; i++) {
            System.out.println("Name of excercise " + i); //skipping over this line the second and third iterations
            name[i-1] = input.next();
            System.out.println("Score received for excercise " + i);
            score[i-1] = input.nextInt();
            System.out.println("Total points possible for exercise " + i);
            totalScore[i-1] = input.nextInt();
        }
        
        System.out.println("Exercise            Score            Total Possible");
        for (int i = 1; i <= NUM_PROJECTS; i++) {
            spaces = "";
            num_spaces = 20 - name[i-1].length(); //trying to calculate how many spaces to add to the name to balance the grid
            
            for (int j = 0; j < num_spaces; j++) {
                spaces += " ";
            }
            System.out.print("\n" + name[i-1] + spaces);
            if(score[i-1]<10)
            {
                spaces = " ";
            }else{
                spaces = "";
            }
            System.out.println(score[i-1] + spaces + "               " + totalScore[i-1]);
        }
        
        for (int i = 0; i < NUM_PROJECTS; i++) {
            total += score[i];
            max += totalScore[i];
        }
    
        DecimalFormat percent = new DecimalFormat("0.00%");
        ratio = ((float)total)/max;
        
        System.out.println("You had a cumulative total of " + total + " points out of " + max + " points");
        System.out.println("This results in a score of " + percent.format(ratio));
    }
}
