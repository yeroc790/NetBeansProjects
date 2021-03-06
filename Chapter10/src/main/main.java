/*
 * This file runs each project
 * Problems: 1,2,4
 *
 */
package main;
import java.util.Scanner;
import project1.project1;
import project2.project2;
import project4.project4;

/**
 *
 * @author hansenc
 */
public class main {
    public static void main(String[] args) {
        int input = 0;
        boolean quit=false, error=false;
        Scanner scanner = new Scanner(System.in);
        
        project1 p1 = new project1();
        project2 p2 = new project2();
        project4 p4 = new project4();
        
        while(quit==false){
            System.out.println("\nWhich project would you like to run?");
            System.out.println("(1,2,4) TYPE 0 TO QUIT");
            
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
                case 1:
                    System.out.println("-- Project 1 --");
                    p1.main(args);
                    break;
                case 2:
                    System.out.println("-- Project 2 --");
                    p2.main(args);
                    break;
                case 4:
                    System.out.println("-- Project 4 --");
                    p4.main(args);
                    break;
                default: 
                    System.out.println("Invalid number, try again");
                    break;
            }
        }
    }
}