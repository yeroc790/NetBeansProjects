/*
 * This simulates 10,000 games of craps, and calculates the probability of winning
 */
package project2;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author hansenc
 */
public class project2 {
    public static void main(String[] args) {
        int die1, die2, sum, point = 0;
        int numWins = 0, numLosses = 0;
        boolean win = false, loss = false;
        Random rand = new Random();
        float ratio;
        
        for (int i = 0; i < 10000; i++) {
            die1 = rand.nextInt(6) + 1; //6 max, 1 min
            die2 = rand.nextInt(6) + 1;
//        System.out.println("You rolled a " + die1 + " and a " + die2);
            sum = die1 + die2;
        
            //first roll
            switch(sum)
            {
                case 7:
                    win = true;
                    break;
                case 11:
                    win = true;
                    break;
                case 2:
                    win = false;
                    loss = true;
                    break;
                case 3:
                    win = false;
                    loss = true;
                    break;
                case 12:
                    win = false;
                    loss = true;
                    break;
                case 4:
                    win = false;
                    loss = false;
                    point = 4;
                    break;
                case 5:
                    win = false;
                    loss = false;
                    point = 5;
                    break;
                case 6:
                    win = false;
                    loss = false;
                    point = 6;
                    break;
                case 8:
                    win = false;
                    loss = false;
                    point = 8;
                    break;
                case 9:
                    win = false;
                    loss = false;
                    point = 9;
                    break;
                case 10:
                    win = false;
                    loss = false;
                    point = 10;
                    break;   
            }
            if((win==false)&&(loss==false))
            {
                //keep rolling
                do{
                    die1 = rand.nextInt(6) + 1;
                    //6 max, 1 min
                    die2 = rand.nextInt(6) + 1;
                    sum = die1 + die2;
                    if(sum==point)
                    {
                        //win
                        numWins++;
                        win = true;
                    }else{
                        //loss
                        numLosses++;
                        loss = true;
                    }
                }while((loss==false)&&(win==false));
            }else if(win==true){
                //win
                numWins++;
            }else{
                //loss
                numLosses++;
            }
        }
        
        System.out.println("The user beat the house " + numWins + " out of " + (numWins + numLosses) + " games of craps");
        
        DecimalFormat percent = new DecimalFormat("0.00%");
        ratio = ((float)numWins)/(numWins + numLosses);
        
        System.out.println("That is a " + percent.format(ratio) + " chance of winning");
        if(ratio>0.5)
        {
            System.out.println("You could probably make some money!");
        }else{
            System.out.println("Probably not a good idea to bet any money");
        }
        
    }
}
