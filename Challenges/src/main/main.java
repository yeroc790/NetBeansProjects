/*
 * This file runs different challenge projects
 *
 */
package main;
import java.util.Scanner;
import chapter4.chapter4;
import temp.temp;
import array.array;
import matrix.matrix;
import inheritance.Inheritance;

/**
 *
 * @author hansenc
 */
public class main {
    public static void main(String[] args) {
        int input = 0;
        boolean quit=false, error=false;
        Scanner scanner = new Scanner(System.in);
        
        chapter4 c4 = new chapter4();
        temp t = new temp();
        array a = new array();
        matrix m = new matrix();
        Inheritance i = new Inheritance(); //inheritance
        
        while(quit==false){
            System.out.println("\nWhich chapter challenge project would you like to run?");
            System.out.println("Valid inputs: (0, 4, 20(temperature), 21(array), 22(matrix), 23(inheritance) TYPE 0 TO QUIT");
            
            do{
                if(scanner.hasNextInt())
                {
                    input = scanner.nextInt();
                    error = false;
                }else{
                    System.out.println("Incorrect input, try again");
                    error = true;
                }
            }while(error==true);
            
            switch(input)
            {
                case 0:
                    quit = true;
                    break;
                case 4:
                    System.out.println("-- Chapter 4 Challenge Project --");
                    c4.main(args);
                    break;
                case 20:
                    System.out.println("-- Temperature --");
                    t.main(args);
                    break;
                case 21:
                    System.out.println("-- Array --");
                    a.main(args);
                    break;
                case 22:
                    System.out.println("-- Matrix --");
                    m.main(args);
                    break;
                case 23:
                    System.out.println("-- Inheritance --");
                    i.main(args);
                    break;
                default: 
                    System.out.println("Invalid number, try again");
                    break;
            }
        }
    }
}