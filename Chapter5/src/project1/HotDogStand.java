/**
 * Hotdog Stand
 */
package project1;

/**
 * 
 * @author hansenc
 */
public class HotDogStand {
    private int ID; //hotdog stand id
    private int num; //number of hotdogs sold
    private static int i = 1; //keeps track of what id's have been used
    
    public HotDogStand(){
        ID = i;
        i++;
        num = 0;
    }
    
    public HotDogStand(int newNum){
        num = newNum;
    }
    
    public void justSold(){
        num++;
    }
    
    public void displayInfo(){
        System.out.println("Hotdog stand #" + ID + " sold " + num + " hot dogs today");
    }
    
    public int getNum(){
        return num;
    }
    
    public int getID(){
        return ID;
    }
}
