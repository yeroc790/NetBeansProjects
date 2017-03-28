/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author hansenc
 */
public class Vehicle {
    private int maxSpeed;
    private String color;
    private int year;
    
    public Vehicle(){
        maxSpeed = 0;
        color = null;
        year = 0;
    }
    
    public Vehicle(int maxSpeed, String color, int year){
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.year = year;
    }
    
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public int getMaxSpeed(){
        return maxSpeed;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getYear(){
        return year;
    }
    
    @Override
    public String toString(){
        return("The vehicle is " + color + ", was made in " + year + ", and can go " + maxSpeed + "mph.");
    }
}
