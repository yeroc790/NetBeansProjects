/*
 * What is this?
 */
package project1;

/**
 *
 * @author hansenc
 */
public class Score {
    private double[] scores; //size determined later
    private double difficulty; //1.2 - 3.8
    private double finalScore; 
    
    public Score(double[] a, double diff){
        scores = a;
        if((diff>1.2)&&(diff<3.8)){
            difficulty = diff;
        }else{
            difficulty = 1.2;
        }
    }
    
    public Score(double[] a){
        scores = a;
        difficulty = 1.2;
    }
    
    public void setScores(double[] a){
        scores = a;
    }
    
    public void setDifficulty(double diff){
        if((diff>1.2)&&(diff<3.8)){
            difficulty = diff;
        }else{
            difficulty = 1.2;
        }
    }
    
    public void setFinalScore(double score){
        finalScore = score;
    }
    
    public double[] getScores(){
        return scores;
    }
    
    public double getDifficulty(){
        return difficulty;
    }
    
    public void displayScore(){
        System.out.println("Number of votes:" + scores.length);
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Final Score: " + finalScore);
    }
}
