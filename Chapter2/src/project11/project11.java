/*
 * This application takes project scores and calculates the final grade
 */
package project11;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project11 {
    public static void main(String[] args) {
        final int NUM_PROJECTS = 3;
        Scanner input = new Scanner(System.in);
        String[] name = new String[3];
        int[] score = new int[3];
        int[] totalScore = new int[3];
        int num_spaces;
        String spaces = "";
        input.useDelimiter("\n");
        int total, max;
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
        
        total = score[0] + score[1] + score[2];
        max = totalScore[0] + totalScore[1] + totalScore[2];
    
        DecimalFormat percent = new DecimalFormat("0.00%");
        ratio = ((float)total)/max;
        
        System.out.println("You had a cumulative total of " + total + " points out of " + max + " points");
        System.out.println("This results in a score of " + percent.format(ratio));
    }
}
