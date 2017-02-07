/*
 * Just testing
 */
package project1;

/**
 *
 * @author hansenc
 */
public class project1 {
    public static void main(String[] args) {
        double[] a = {10,2.5,3.9,5.8,8.2,3.6};
        Score myScore = new Score(a, 1.2);
        
        myScore.calculateFinalScore();
        myScore.displayScore();
    }
}
