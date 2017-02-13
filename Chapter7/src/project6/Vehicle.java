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
public class Vehicle {
    private String brand; //manufacturer's name
    private int numCylinders;
    Person owner;
    
    public Vehicle(){
        brand = "";
        numCylinders = 0;
        owner = new Person();
    }
    
    public Vehicle(String newBrand, int newCylinders, Person newOwner){
        brand = newBrand;
        numCylinders = newCylinders;
        owner = newOwner;
    }
    
    public void setBrand(String newBrand){
        brand = newBrand;
    }
    
    public void setNumCylinders(int num){
        numCylinders = num;
    }
    
    public void setOwner(Person newOwner){
        owner = newOwner;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public int getNumCylinders(){
        return numCylinders;
    }
    
    public Person getOwner(){
        return owner;
    }
    
    @Override
    public String toString(){
        return (owner.toString() + " owns a " + numCylinders + "-cylinder " + brand);
    }
}
