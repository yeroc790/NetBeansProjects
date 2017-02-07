/*
 * This application reads from a text file and manipulates that text
 */
package project8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project8 {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try{
            fileIn = new Scanner(new FileInputStream("src/project8/test.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
            System.exit(0);
        }
        
        String sentence;
        sentence = fileIn.nextLine();
        System.out.println("default:   " + sentence);
        System.out.println("uppercase: " + sentence.toUpperCase());
        System.out.println("lowercase: " + sentence.toLowerCase());
    }
}
