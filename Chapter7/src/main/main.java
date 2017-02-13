/*
 * This file runs each project
 * Problems: 1,3,4,5,6
 *
 */
package main;
import java.util.Scanner;
import project1.project1;
import project3.project3;
import project4.project4;
import project5.project5;
//import project6.project6;

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
        project4 p4 = new project4();
        project5 p5 = new project5();
//        project6 p6 = new project6();
        
        while(quit==false){
            System.out.println("\nWhich project would you like to run?");
            System.out.println("(1,3,4,5,6) TYPE 0 TO QUIT");
            
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
                case 4:
                    System.out.println("-- Project 4 --");
                    p4.main(args);
                    break;
                case 5:
                    System.out.println("-- Project 5 --");
                    p5.main(args);
                    break;
//                case 6:
//                    System.out.println("-- Project 6 --");
//                    p6.main(args);
//                    break;
                default: 
                    System.out.println("Invalid number, try again");
                    break;
            }
        }
    }
}