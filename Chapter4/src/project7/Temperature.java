/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

/**
 *
 * @author hansenc
 */
public class Temperature {
    private int temp;
    private char scale; //has value 'c' for Celcius or 'f' for Fahrenheit
    
    /* -- Begin Constructors -- */
    //set temp and scale
    public Temperature(int newTemp, char newScale){
        temp = newTemp;
        if((newScale=='c')||(newScale=='f'))
        {
            scale = newScale;
        }else{
            scale = 'c';
        }
    }
    
    //set temp, with default scale
    public Temperature(int newTemp){
        temp = newTemp;
        scale = 'c';
    }
    
    //set scale, with default temp
    public Temperature(char newScale){
        temp = 0;
        if((newScale=='c')||(newScale=='f'))
        {
            scale = newScale;
        }else{
            scale = 'c';
        }
    }
    
    //default constructor
    public Temperature(){
        temp = 0;
        scale = 'c';
    }
    /* -- End Constructors -- */
    
    /* -- Begin Accessors -- */
    public int getTemp(){
        return temp;
    }
    
    public char getScale(){
        return scale;
    }
    
    public int getFahrenheit(){
        if(scale=='c'){
            temp = ((9*temp)/5) + 32;
            scale = 'f';
        }
        return temp;
    }
    
    public int getCelcius(){
        if(scale=='f'){
            temp = (5*(temp-32))/9;
            scale = 'c';
        }
        return temp;
    }
    /* -- End Accessors -- */
    
    /* -- Begin Mutators -- */
    public void setTemp(int newTemp){
        temp = newTemp;
    }
    
    public void setScale(char newScale){
        if((newScale=='c')||(newScale=='f')){
            scale = newScale;
        }else{
            scale = 'c';
        }
    }
    
    public void setAll(int newTemp, char newScale){
        temp = newTemp;
        if((newScale=='c')||(newScale=='f')){
            scale = newScale;
        }else{
            scale = 'c';
        }
    }
    /* -- End Mutators -- */
    
    /* -- Begin Comparisons -- */
    public boolean equals(Temperature otherTemp){
        return((temp==otherTemp.getTemp())&&(scale==otherTemp.getScale()));
    }
    
    //local temp > otherTemp
    public boolean isGreater(Temperature otherTemp){
        if((scale=='c')&&(otherTemp.getScale()=='f')){ //sets both to 'c'
            otherTemp.setTemp(otherTemp.getCelcius());
        }else if((scale=='f')&&(otherTemp.getScale()=='c')){
            otherTemp.setTemp(otherTemp.getFahrenheit());
        }
        
        return (temp>otherTemp.getTemp());
    }
    
    //local temp < otherTemp
    public boolean isLess(Temperature otherTemp){
        if((scale=='c')&&(otherTemp.getScale()=='f')){ //sets both to 'c'
            otherTemp.setTemp(otherTemp.getCelcius());
        }else if((scale=='f')&&(otherTemp.getScale()=='c')){
            otherTemp.setTemp(otherTemp.getFahrenheit());
        }
        
        return (temp<otherTemp.getTemp());
    }
    /* -- End Comparisons -- */
    
    public void displayTemp(){
        System.out.println("Temp: " + temp + scale);
    }
}
