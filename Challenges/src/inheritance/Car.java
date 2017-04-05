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
public class Car extends Vehicle{
    private String manufacturer;
    private String model;
    private String engine; //V6, V8
    
    public Car(){
        super();
        manufacturer = null;
        model = null;
        engine = null;
    }
    
    public Car(int maxSpeed, String color, int year, String manufacturer, String model, String engine){
        super(maxSpeed, color, year);
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setEngine(String engine){
        this.engine = engine;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getEngine(){
        return engine;
    }
    
    @Override
    public String toString(){
        return ("My car is a " + getColor() + " " + getYear() + " " + manufacturer + " " + model + " with a " + engine + " engine. It can go " + getMaxSpeed() + "mph");
    }
}
