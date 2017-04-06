/*
 * Could split the text file into two files or maybe arrays, one for boys, one for girls
 * The popularity is determined by the index number
 */
package project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileChannel;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class project1 {
    public static void main(String[] args) {
//        SplitFile.initialize(); files are created and set up
        Person[] boys, girls;
        Scanner input = new Scanner(System.in);
        int numBoys = 0, numGirls = 0, index = 0;
        boolean quit = false;
        String boyPath = "src\\project1\\boys.txt";
        String girlPath = "src\\project1\\girls.txt";
        
        //initializing boys and girls
//        numBoys = getLength(boyPath);
//        numGirls = getLength(girlPath);
        
//        System.out.println("numBoys: " + numBoys);
//        System.out.println("numGirls: " + numGirls);
        
        boys = populate(boyPath, 1000); //isn't starting at the top, so boys and girls aren't getting populated
        girls = populate(girlPath, 1000);

        
        /* -- End of Setup -- */
        
        /* -- Begin Main Program -- */
        String name;
        System.out.println("Welcome to the name database!");
        System.out.println("Type a name to search for to get started");
        System.out.println("Type \"quit\" to quit\n");
        
//        displayPeople(boys);
//        displayPeople(girls);
        
        while(quit==false){
            name = input.nextLine();
            if(name.equals("quit"))
                quit = true;
            else
                search(name, boys, girls);
        }
    }
    
    public static int getLength(String path){
        Scanner file = null;
        int length = 0;
        
        try{
            file = new Scanner(new FileInputStream(path));
        }catch(FileNotFoundException e){
            System.out.println("That file could not be found or opened");
            System.exit(0);
        }
        
        String temp;
        while(file.hasNextLine()){
            temp = file.nextLine();
            length++;
        }
        file.close();
        
        return length;
    }
    
    public static Person[] populate(String path, int num){ //isn't starting at the top
        Person[] x = new Person[num];
        Scanner file = null;
        
        try{
            file = new Scanner(new FileInputStream(path));
        }catch(FileNotFoundException e){
            System.out.println("That file could not be found or opened");
            System.exit(0);
        }
        
        String temp;
        for(int i=0; i<num; i++){
            temp = file.nextLine();
            x[i] = process(temp, i);
        }
        file.close();
        return x;
    }
    
    public static Person process(String temp, int index){
        Person x = new Person();
        String[] line = new String[2];
        line = temp.split(",");
        x.setName(line[0]);
        x.setPop(index+1);
        x.setNum(Integer.parseInt(line[1]));
        
        return x;
    }
    
    public static void displayPeople(Person[] arr){
        for(Person temp : arr){
            System.out.println(temp.getName() + "," + temp.getNum());
        }
    }
    
    public static void search(String name, Person[] boys, Person[] girls){
        String original = name;
        String boyString = null, girlString = null;
        int boyPop = 0, girlPop = 0;
        boolean nameFound = false;
        
        //search boys
        for(Person temp : boys){
            if(temp.getName().toLowerCase().equals(name.trim().toLowerCase())){
                boyString = temp.getName() + " is ranked " + temp.getPop() + " in popularity among boys with " + temp.getNum() + " namings in 2015";
                boyPop = temp.getPop();
                nameFound = true;
                break;
            }
        }
        if(nameFound == false){
            boyString = original + " is not one of the top 1,000 boy names from 2015";
        }
        nameFound = false;
        
        
        //search girls
        for(Person temp: girls){
            if(temp.getName().toLowerCase().equals(name.trim().toLowerCase())){
                girlString = temp.getName() + " is ranked " + temp.getPop() + " in popularity among girls with " + temp.getNum() + " namings in 2015";
                girlPop = temp.getPop();
                nameFound = true;
                break;
            }
        }
        if(nameFound == false){
            girlString = original + " is not one of the top 1,000 girl names from 2015";
        }
        
        //display
        if(boyPop<girlPop){
            System.out.println(girlString);
            System.out.println(boyString);
        }else{
            System.out.println(boyString);
            System.out.println(girlString);
        }
    }
}
