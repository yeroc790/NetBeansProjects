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
public class Airplane extends Vehicle{
    private int numEngines;
    private String engine;
    private int capacity;
    
    public Airplane(){
        super();
        numEngines = 0;
        engine = null;
        capacity = 0;
    }
    
    public Airplane(int maxSpeed, String color, int year, int numEngines, String engine, int capacity){
        super(maxSpeed, color, year);
        this.numEngines = numEngines;
        this.engine = engine;
        this.capacity = capacity;
    }
    
    public void setNumEngines(int numEngines){
        this.numEngines = numEngines;
    }
    
    public void setEngine(String engine){
        this.engine = engine;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public int getNumEngines(){
        return numEngines;
    }
    
    public String getEngine(){
        return engine;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    @Override
    public String toString(){
        return ("Your airplane has " + numEngines + " " + engine + " engine(s), was made in " + getYear() + ", can hold " + capacity + " people, is " + getColor() + ", and can go " + getMaxSpeed() + "mph");
    }
}
