/*
 * This application performs the task of a simple arithmatic calculator
 * 
 * Note: The book calls for the ending character to be 'r' or 'R', but I have chosen '='
 * TODO: Work on scannerTest() to get input working in the following form: '+5'
 */
package project6;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project6 {
    private static boolean quit = false;
    
    public static void main(String[] args) {
        System.out.println("Calculator is on");
        System.out.println("Input an operator followed by a number eg. +5");
        System.out.println("Enter '=' to quit\n");
        double result = 0.0;
        System.out.println(result);
        //loop this
        do{
            try{
                result = performOperation(result);
            }catch(UnknownOperatorException e){
                System.out.println("Operator Error: " + e.getMessage());
            }catch(DivisionByZeroException e){
                System.out.println("Math Error: " + e.getMessage());
            }catch(NumberFormatException e){
                System.out.println("Input Error: " + e.getMessage());
            }
            System.out.println(result);
        }while(quit==false);
        
        project6 test = new project6();
        
        
//        scannerTest();
    }
    
    public static double performOperation(double num) throws UnknownOperatorException, DivisionByZeroException, NumberFormatException{
        Scanner input = new Scanner(System.in);
        String line, numString;
        char operator;
        double newNum;
        
        quit = false;
        
        //line gets trimmed of leading and trailing whitespace
        line = input.nextLine().trim();
        operator = line.charAt(0);
        
        //if the line doesn't contain one of these operators as the first character, throw error
        if((operator!='+')&&(operator!='-')&&(operator!='*')&&(operator!='/')&&(operator!='=')){
            throw new UnknownOperatorException("Operator not first character or unknown");
        }
        
        if(line.length()==1){
            //just an operator
            numString = null;
        }else{
            numString = line.substring(1).trim();
        }
        if(numString!=null){
            //if it does not contain a double, it will throw an error, which will get picked up outside the method
            newNum = Double.parseDouble(numString);
        }else{
            newNum = 0;
        }
        
        switch(operator){
            case '=':
                quit = true;
                break;
            case '+':
                num += newNum;
                break;
            case '-':
                num -= newNum;
                break;
            case '*':
                num *= newNum;
                break;
            case '/':
                if(newNum==0)
                    throw new DivisionByZeroException();
                else{
                    num /= newNum;
                }
                break;
        }
        
        return num;
    }
    
    //testing input for calculator, eg. '+ 5'
    //Note: '+5' will not work, and the input is waiting for a type double
    //      '+ 5' will work, however
    public static void scannerTest(){
        Scanner in = new Scanner(System.in);
        
        String line;
        char newChar;
        double newDouble;
        
        //line gets trimmed of leading and trailing whitespace
        line = in.next().trim();
        
        //if the line doesn't contain one of these operators as the first character, throw error
        if((line.indexOf("+")!=0)||(line.indexOf("-")!=0)||(line.indexOf("*")!=0)||(line.indexOf("/")!=0)){
            
        }
        newChar = in.next().charAt(0);
        newDouble = in.nextDouble();
        
        System.out.println("newChar: '" + newChar + "'");
        System.out.println("newDouble: '" + newDouble + "'");
    }
}
