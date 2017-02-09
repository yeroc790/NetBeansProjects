/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class Vehicles {
    private String model, color;
    private double speed = 0; //unknown until findSpeed is run
    
    public Vehicles(){
        model = getInput('m');
        color = getInput('c');
    }
    
    public Vehicles(String m, String c){
        model = m;
        color = c;
    }
    
    public String getInput(char category){
        Scanner input = new Scanner(System.in);
        if(category == 'm')
            System.out.println("Enter a model");
        else
            System.out.println("Enter a color:");
        return input.nextLine();
    }
    
    public void setModel(){
        model = getInput('m');
    } 
    
    public void setModel(String m){
        model = m;
    }
    
    public void setColor(){
        color = getInput('c');
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getModel(){
        return model;
    }
    
    /**
     * Prerequisite: findSpeed() has been run
     */
    public double getSpeed(){
        return speed;
    }
    
    /**
     * Sets this.speed and otherCar.speed, using a formula derived from the question
     * It uses two equations: x + diff = y, time*x + time*y = dist
     * @param otherCar car y
     * @param dist Distance driven
     * @param time Time both cars were driving
     * @param diff Speed difference with respect to the second car, x + diff = y
     * @return 
     */
    public void findSpeed(Vehicles otherCar, double dist, double time, double diff){
        this.speed = (dist - (diff*time))/(2*time);
        otherCar.speed = this.speed + diff;
    }
    /**
     * Prerequisite: findSpeed() has been run
     * @param otherCar this is car y
     */
    public void display(Vehicles otherCar){
        DecimalFormat round = new DecimalFormat("0.00");
        System.out.println("The " + this.color + " " + this.model + " was driving at " + round.format(this.speed) + " mph");
        System.out.println("The " + otherCar.color + " " + otherCar.model + " was driving at " + round.format(otherCar.speed) + " mph");
    }
}
