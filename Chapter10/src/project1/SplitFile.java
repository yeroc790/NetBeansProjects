/*
 * This class splits yob2015.txt into 2 files, boys.txt and girls.txt
 * yob2015.txt is set up in the format: "Mason,M,16535" or "Abigail,F,12311"
 * and will be sent to boys.txt as "Mason,16535" and "Abigail,12311" respectively
 */
package project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class SplitFile {
    public static void initialize(){
        Scanner inputStream = null;
        int count = 0;
        
        try{
            inputStream = new Scanner(new FileInputStream("yob2015.txt"));
        }catch(FileNotFoundException e){
            System.out.println("File yob2015.txt was not found or could not be opened.");
            System.exit(0);
        }
        while(inputStream.hasNextLine()){
            count++;
        }
        System.out.println("There are " + count + " lines in the file yob2015.txt");
    }
}
