/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.util.Scanner;
import reference.SalariedEmployee;

/**
 *
 * @author hansenc
 */
public class Doctor extends SalariedEmployee{
    private String specialty; //eg Pediatrician, Obstetrician, General Practitioner
    private double visitFee;
    
    public Doctor(){
        super();
        specialty = "General Practitioner";
        visitFee = 0; //default
    }
    
    public Doctor(String theName, String theDate, double theSalary, String specialty, double fee){
        super(theName, theDate, theSalary);
        this.specialty = specialty;
        visitFee = fee;
    }
    
    public Doctor(String theName, String theDate, double theSalary){
        super(theName, theDate, theSalary);
        getInput();
    }
    
    public void setSpecialty(String spec){
        specialty = spec;
    }
    
    public void setVisitFee(double fee){
        visitFee = fee;
    }
    
    public String getSpecialty(){
        return specialty;
    }
    
    public double getVisitFee(){
        return visitFee;
    }
    
    private void getInput(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the doctor's specialty");
        specialty = input.nextLine();
        
        System.out.println("Please enter the visit fee");
        visitFee = input.nextDouble();
    }
    
    @Override
    public String toString(){
        return ("\n" + getName() + " " + getHireDate() + "\n$" + getSalary() + " per year\nSpecialty: " + specialty + "\nVisit Fee: $" + visitFee);
    }
}
