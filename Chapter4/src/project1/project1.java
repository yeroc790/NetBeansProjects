/*
 * This project displays the song "99 bottles of beer on the wall" but with the numbers spelled out
 * eg. ninety-nine bottles of beer on the wall
 */
package project1;

/**
 *
 * @author hansenc
 */
public class project1 {
    public static String string;
    
    public static void main(String[] args) {
        int num = 99;
        num = BeerSong(num);
        printSong(num);
    }
    
    //caps if num<0 or num>99
    public static int BeerSong(int num){
        if(num<0)
        {
            num = 0;
        }else if(num>99)
        {
            num = 99;
        }else{
            num = num;
        }
        
        return num;
    }
    
    //prints song for num lines
    public static void printSong(int num) {
        String line1, line2, line3;
        
        for (int i = num; i >= 1; i--) {
            convertNum(i);
            
            if(i==1)
            {
                line1 = "" + string + " last bottle of beer on the wall,";
                line2 = "" + string + " last bottle of beer,";
                line3 = "take it down, pass it around,";
            }else{
                line1 = "" + string + " bottles of beer on the wall,";
                line2 = "" + string + " bottles of beer,";
                line3 = "take one down, pass it around,";
            }
            
            
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);
            System.out.println(line1 + "\n");
        }
    }
    
    //converts number to string
    public static void convertNum(int num){ //it should += to string, and reiterate until it is complete, 10's first, then 1's
        int tens = 0;
        tens = (int) Math.floor(num/10);
//        System.out.println("tens: '" + tens + "'");
//        string = "" + tens + ""; //string needs to be set to a string number value eg ninety-nine
//        System.out.println("string: '" + string + "'");
        
        if(num<20)
        {
            switch (num){
                case 1: 
                    string = "one";
                    break;
                case 2:
                    string = "two";
                    break;
                case 3:
                    string = "three";
                    break;
                case 4:
                    string = "four";
                    break;    
                case 5:
                    string = "five";
                    break;    
                case 6:
                    string = "six";
                    break;    
                case 7:
                    string = "seven";
                    break;    
                case 8:
                    string = "eight";
                    break;    
                case 9:
                    string = "nine";
                    break;
                case 10:
                    string = "ten";
                    break;
                case 11:
                    string = "eleven";
                    break;
                case 12:
                    string = "twelve";
                    break;
                case 13:
                    string = "thirteen";
                    break;
                case 14:
                    string = "fourteen";
                    break;
                case 15:
                    string = "fifteen";
                    break;
                case 16:
                    string = "sixteen";
                    break;
                case 17:
                    string = "seventeen";
                    break;
                case 18:
                    string = "eighteen";
                    break;
                case 19:
                    string = "nineteen";
                    break;
            }
        }else{
            switch (tens){
                case 2:
                    string = "twenty-";
                    convNum(num%10);
                    break;
                case 3:
                    string = "thirty-";
                    convNum(num%10);
                    break;
                case 4:
                    string = "forty-";
                    convNum(num%10);
                    break;
                case 5:
                    string = "fifty-";
                    convNum(num%10);
                    break;
                case 6:
                    string = "sixty-";
                    convNum(num%10);
                    break;
                case 7:
                    string = "seventy-";
                    convNum(num%10);
                    break;
                case 8:
                    string = "eighty-";
                    convNum(num%10);
                    break;
                case 9:
                    string = "ninety-";
                    convNum(num%10);
                    break;
            }
        }
    }
    
    //only used by ConvertNum if num>20 because the += was causing problems if num<10
    public static void convNum(int num)
    {
        switch (num){
                case 1: 
                    string += "one";
                    break;
                case 2:
                    string += "two";
                    break;
                case 3:
                    string += "three";
                    break;
                case 4:
                    string += "four";
                    break;    
                case 5:
                    string += "five";
                    break;    
                case 6:
                    string += "six";
                    break;    
                case 7:
                    string += "seven";
                    break;    
                case 8:
                    string += "eight";
                    break;    
                case 9:
                    string += "nine";
                    break;
                case 0:
                    string = string.substring(0,(string.length()-1)); //removes extra '-' character
                    break;
        }
    }
}    
