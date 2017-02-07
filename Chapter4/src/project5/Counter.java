/*
 * To be used with project 5
 */
package project5;

/**
 *
 * @author hansenc
 */
public class Counter {
    private static int num;
    
    //default constructor
    Counter(){
        num = 0;
    }
    
    //other constructor
    Counter(int number){
        if(number>0)
        {
            num = number;
        }else{
            num = 0;
        }
    }
    
    //sets num to 0
    public static void toZero(){
        num = 0;
    }
    
    //adds 1 to num
    public static void increment(){
        num++;
    }
    
    //subtracts 1 from num
    public static void decrement(){
        if(num!=0)
        {
          num--;
        }
    }
    
    //returns num
    public static int getNum(){
        return num;
    }
    
    //displays num
    public static void displayNum(){
        System.out.println("num: " + num);
    }
}
