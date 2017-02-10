/*
 * This class specifies an object of type Pizza
 */
package project15;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class Pizza {
    private char size;
    private String toppings; //since price is determined by amount of toppings, num toppings is toppings.length() 
                             //if toppings = "pos" (pineapple, olives, sausage)
    
    /* -- Begin Constructors -- */
    public Pizza(){
        getInput();
    }
    
    public Pizza(int i){
        getInput(i);
    }
    
    public Pizza(char newSize){
        if((newSize=='s')||(newSize=='m')||(newSize=='l')){
            size = newSize;
        }else{
            size = 's';
        }
        toppings = null;
    }
    
    public Pizza(String newToppings){
        size = 's';
        toppings = newToppings;
    }
    
    public Pizza(char newSize, String newToppings){
        if((newSize=='s')||(newSize=='m')||(newSize=='l')){
            size = newSize;
        }else{
            size = 's';
        }
        toppings = newToppings;
    }
    /* -- End Constructors -- */
    
    /* -- Begin Mutators -- */
    public void setSize(char newSize){
        if((newSize=='s')||(newSize=='m')||(newSize=='l')){
            size = newSize;
        }else{
            size = 's';
        }
    }
    
    public void setToppings(String newToppings){
        toppings = newToppings;
    }
    /* -- End Mutators -- */
    
    /* -- Begin Accessors -- */
    public String getSize(){
        if(size=='s'){
            return "small";
        }else if(size=='m'){
            return "medium";
        }else{
            return "large";
        }
    }
    
    public String getToppings(){
        String list = "x";
        for (int i = 0; i < toppings.length(); i++) {
            switch (toppings.charAt(i)) {
                case 'o':
                    list += "olives";
                    break;
                case 'p':
                    list += "pineapples";
                    break;
                case 's':
                    list += "sausage";
                    break;
                case 'j':
                    list += "jalepenos";
                    break;
                case 'm':
                    list += "mushrooms";
                default:
                    list += "invalid_topping";
                    break;
            }
            if(i!=(toppings.length()-1)){
                list += ", ";
            }
        }
        if((toppings.length()==1)&&(toppings.charAt(0)=='n')){
            list = "xplain cheese";
        }
        return list.substring(1);
    }
    /* -- End Accessors -- */
    
    @Override
    public String toString(){
        return("You ordered a " + getSize() + " pizza with the following toppings: " + getToppings());
    }
    
    public void displayPizza(){
        System.out.println("You ordered a " + getSize() + " pizza with the following toppings: " + getToppings());
    }
    
    public void displayPizza(int i){
        System.out.println("Pizza " + (i+1) + ": A " + getSize() + " pizza with the following toppings: " + getToppings());
    }
    
    public void getInput(){
        Scanner input = new Scanner(System.in);
        char tempSize;
        
        /* -- Size -- */
        System.out.println("What size pizza would you like? (s, m, l)");
        tempSize = input.next().charAt(0);
        if(tempSize=='s')
            size = 's';
        else if(tempSize=='m')
            size = 'm';
        else if(tempSize=='l')
            size = 'l';
        else{
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        /* -- Toppings -- */
        System.out.println("Please enter a character for each topping you want");
        System.out.println("o: Olives");
        System.out.println("p: Pineapples");
        System.out.println("s: Sausage");
        System.out.println("j: Jalepenos");
        System.out.println("m: Mushrooms");
        System.out.println("n: No toppings (cheese)\n");
        toppings = input.next();       
    }
    
    public void getInput(int i){
        Scanner input = new Scanner(System.in);
        
        /* -- Size -- */
        System.out.println("\nPizza " + (i+1) + ":");
        System.out.println("What size pizza would you like? (s, m, l)");
        char tempSize = input.next().charAt(0);
        if(tempSize=='s')
            size = 's';
        else if(tempSize=='m')
            size = 'm';
        else if(tempSize=='l')
            size = 'l';
        else{
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        /* -- Toppings -- */
        System.out.println("Please enter a character for each topping you want");
        System.out.println("o: Olives");
        System.out.println("p: Pineapples");
        System.out.println("s: Sausage");
        System.out.println("j: Jalepenos");
        System.out.println("m: Mushrooms");
        System.out.println("n: No toppings (cheese)\n");
        toppings = input.next();       
    }
    
    public int getCost(){
        int cost = 0;
        if(size=='s'){
            cost += 10;
        }else if(size=='m'){
            cost += 12;
        }else{
            cost = 14;
        }
        
        cost += (toppings.length()*2);
        return cost;
    }
}
