/*
 * This file runs each project
 * Problems: 1,5,7,9,11
 *
 */
package main;
import java.util.Scanner;
import project1.project1;
import project5.project5;
import project7.project7;
import project9.project9;
import project11.project11;

import classTest.mainTestDemo;

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
        project5 p5 = new project5();
        project7 p7 = new project7();
        project9 p9 = new project9();
        project11 p11 = new project11();

          mainTestDemo test = new mainTestDemo();
        
        while(quit==false){
            System.out.println("\nWhich project would you like to run?");
            System.out.println("(1,5,7,9,11) TYPE 0 TO QUIT");
            
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
                case 5:
                    System.out.println("-- Project 5 --");
                    p5.main(args);
                    break;
                case 7:
                    System.out.println("-- Project 7 --");
                    p7.main(args);
                    break;
                case 9:
                    System.out.println("-- Project 9 --");
                    p9.main(args);
                    break;
                case 11:
                    System.out.println("-- Project 11 --");
                    p11.main(args);
                    break;
                    
                case 12:
                    System.out.println("-- Test --");
                    test.main(args);
                    break;
                default: 
                    System.out.println("Invalid number, try again");
                    break;
            }
        }
    }
}
