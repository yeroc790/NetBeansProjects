/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.Scanner;
import reference.SalariedEmployee;

/**
 *
 * @author hansenc
 */
public class Administrator extends SalariedEmployee{
    private String title; //eg Director or Vice President
    private String area; //eg Production or Accounting or Personnel
    private String bossName; //name of supervisor
    
    public Administrator(){
        super();
        title = "Default Title";
        area = "Default Area";
        bossName = "Default Name";
    }
    
    public Administrator(String theName, String theDate, double theSalary){
        super(theName, theDate, theSalary);
        getInput();
    }
    
    public Administrator(String theName, String theDate, double theSalary, String title, String area, String bossName){
        super(theName, theDate, theSalary);
        this.title = title;
        this.area = area;
        this.bossName = bossName;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setArea(String area){
        this.area = area;
    }
    
    public void setBossName(String bossName){
        this.bossName = bossName;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArea(){
        return area;
    }
    
    public String getBossName(){
        return bossName;
    }
    
    private void getInput(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nPlease enter the Administer Title");
        title = input.nextLine();
        
        System.out.println("Please enter the area of responsibility");
        area = input.nextLine();
        
        System.out.println("Please enter the supervisor's name");
        bossName = input.nextLine();
    }
    
    @Override
    public String toString(){
        return ("\n" + getName() + " " + getHireDate() + "\n$" + getSalary() + " per year\nTitle: " + title + "\nArea: " + area + "\nSupervisor: " + bossName);
    }
}
