/*
 * Class for determining a total score
 * The highest and lowest scores are thrown out
 * The remaining scores are added together
 * The sum is multiplied by the difficulty modifier
 * The total is then multiplied by 0.6 to get the final score
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
        double[] b;
        b = orderArray(a);
        scores = b;
        if((diff>1.2)&&(diff<3.8)){
            difficulty = diff;
        }else{
            difficulty = 1.2;
        }
    }
    
    public Score(double[] a){
        double[] b;
        b = orderArray(a);
        scores = b;
        difficulty = 1.2;
    }
    
    public void setScores(double[] a){
        double[] b;
        b = orderArray(a);
        scores = b;
    }
    
    private double[] orderArray(double[] a){
        double[] b = new double[a.length];
        boolean swap = false;
        double temp;
        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        
        do{
            swap = false;
            for (int i = 0; i < b.length; i++) {
                if((i+1)!=b.length){
                    if(b[i]<b[i+1]){
                        temp = b[i];
                        b[i] = b[i+1];
                        b[i+1] = temp;
                        swap = true;
                    }
                }    
            }
        }while(swap==true);
        return b;
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
    
    
    
    public void calculateFinalScore(){
        double num = 0;
        for (int i = 0; i < scores.length; i++) {
            if((i!=0)&&(i!=(scores.length-1))) //tossing out the highest and lowest scores
            {
                num += scores[i];
            }
        }
        num *= difficulty;
        num *= 0.6;
        finalScore = num;
    }
}
