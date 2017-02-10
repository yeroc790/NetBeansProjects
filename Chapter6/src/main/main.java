/*
 * This file runs each project
 * Problems: 1,3,5,8,11,15
 *
 */
package main;
import java.util.Scanner;
import project1.project1;
import project3.project3;
import project5.project5;
import project8.project8;
import project11.project11;
import project15.project15;

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
        project3 p3 = new project3();
        project5 p5 = new project5();
        project8 p8 = new project8();
        project11 p11 = new project11();
        project15 p15 = new project15();
        
        while(quit==false){
            System.out.println("\nWhich project would you like to run?");
            System.out.println("(1,3,5,8,11,15) TYPE 0 TO QUIT");
            
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
                case 3:
                    System.out.println("-- Project 3 --");
                    p3.main(args);
                    break;
                case 5:
                    System.out.println("-- Project 5 --");
                    p5.main(args);
                    break;
                case 8:
                    System.out.println("-- Project 8 --");
                    p8.main(args);
                    break;    
                case 11:
                    System.out.println("-- Project 11 --");
                    p11.main(args);
                    break;
                case 15:
                    System.out.println("-- Project 15 --");
                    p15.main(args);
                    break;
                default: 
                    System.out.println("Invalid number, try again");
                    break;
            }
        }
    }
}