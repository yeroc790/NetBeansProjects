/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author hansenc
 */
public class project1 {
    public static void main(String[] args) {
        double[] a = {10,2.5,3.9};
        Score myScore = new Score(a, 1.2);
        
        myScore.setFinalScore(6.8);
        myScore.displayScore(); //things are working so far
        //need to build the score calculation method
    }
}
