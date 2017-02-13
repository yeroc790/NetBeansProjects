/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

/**
 *
 * @author hansenc
 */
public class Truck extends Vehicle{
    private double load; //load capacity in tons
    private int tow; //towing capacity in pounds
    
    public Truck(){
        super();
        load = 0;
        tow = 0;
    }
    
    public Truck(String brand, int num, Person owner){
        super(brand, num, owner);
        load = 0;
        tow = 0;
    }
    
    public Truck(String brand, int num, Person owner, double load, int tow){
        super(brand, num, owner);
        this.load = load;
        this.tow = tow;
    }
    
    public void setLoad(double load){
        this.load = load;
    }
    
    public void setTow(int tow){
        this.tow = tow;
    }
    
    public double getLoad(){
        return load;
    }
    
    public int getTow(){
        return tow;
    }
    
    @Override
    public String toString(){
        return (getOwner().toString() + " drives a " + getNumCylinders() + "-cylinder " + getBrand() + "\nLoad capacity: " + load + " tons\nTow capacity: " + tow + " pounds");
    }
}
