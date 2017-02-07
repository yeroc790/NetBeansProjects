/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project9;

/**
 *
 * @author hansenc
 */
public class Animals {
    private String species;
    private int pop; //population of species
    private double growth; //growth rate for species in percentage form, if negative, species is endangered
    
    public Animals(String newSpecies, int newPop, double newGrowth){
        species = newSpecies;
        pop = newPop;
        growth = newGrowth;
    }
    
    public Animals(){
        species = "Snow Leopard";
        pop = 5335;
        growth = -0.5;
    }
    
    public void setSpecies(String newSpecies){
        species = newSpecies;
    }
    
    public void setPop(int newPop){
        pop = newPop;
    }
    
    public void setGrowth(double newGrowth){
        growth = newGrowth;
    }
    
    public String getSpecies(){
        return species;
    }
    
    public int getPop(){
        return pop;
    }
    
    public double getGrowth(){
        return growth;
    }
    
    public boolean endangered(){
        return(growth<0);
    }
    
    public boolean equals(Animals otherAnimal){
        return((species.equals(otherAnimal.getSpecies()))&&(pop == otherAnimal.getPop())&&(growth == otherAnimal.getGrowth()));
    }
    
    @Override
    public String toString(){
        return (species + ", population " + pop + ", growth rate " + growth);
    }
    
    public void displayAnimal(){
        System.out.println(species + ", population " + pop + ", growth rate " + growth);
    }
}
