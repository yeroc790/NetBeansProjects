/*
 * This class splits yob2015.txt into 2 files, boys.txt and girls.txt
 * yob2015.txt is set up in the format: "Mason,M,16535" or "Abigail,F,12311"
 * and will be sent to boys.txt as "Mason,16535" and "Abigail,12311" respectively
 */
package project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class SplitFile {
    public static void initialize(){
        Scanner inputStream = null;
        PrintWriter boysOut=  null;
        PrintWriter girlsOut = null;
        int count = 0;
        
        //setting up input
        try{
            inputStream = new Scanner(new FileInputStream("src\\project1\\yob2015.txt"));
            
        }catch(FileNotFoundException e){
            System.out.println("File yob2015.txt was not found or could not be opened.");
            System.exit(0);
        }
        
        //setting up outputs
        try{
            boysOut = new PrintWriter(new FileOutputStream("src\\project1\\boys.txt"));
            girlsOut = new PrintWriter(new FileOutputStream("src\\project1\\girls.txt"));
        }catch(FileNotFoundException e){
            System.out.println("Error setting output files:");
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
        System.out.println("Reading file...");
        System.out.println("Please wait");
        
        String line = null;
        String parts[] = null;
        String parsedLine = null;
        while(inputStream.hasNextLine()){
            line = inputStream.nextLine();
            count++;
            
            parts = line.split(",");
            parsedLine = parts[0] + "," + parts[2];
            if(line.contains(",M,")){ //if statement not working
                boysOut.println(parsedLine);
            }else{ //if(parts[1] == "F") isn't working as intended
                girlsOut.println(parsedLine);
            }
        }
        System.out.println("There are " + count + " lines in the file yob2015.txt"); //32952 lines
        
        boysOut.close();
        girlsOut.close();
    }
}
