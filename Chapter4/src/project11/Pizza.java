/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;

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
        size = 's';
        toppings = null; //plain cheese
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
                    break;
            }
            if(i!=(toppings.length()-1)){
                list += ", ";
            }
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
