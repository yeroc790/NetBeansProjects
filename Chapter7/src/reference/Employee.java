/*
 * This is the base class for SalariedEmployer
 */
package reference;

import java.util.Date;

/**
 *
 * @author hansenc
 */
public class Employee {
    private String name;
    private String hireDate; //Date is a deprecated format and doesn't work the way the book says, so I use a string "mm/dd/yyyy"
    public Employee(){
        name = "No name";
        hireDate = "01/01/1000"; //Just a placeholder
    }
    
    /**
     * Precondition: Neither theName nor theDate is null
     */
    public Employee(String theName, String theDate){
        if(theName == null || theDate == null){
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }
        name = theName;
        hireDate = theDate;
    }
    
    public Employee(Employee originalObject){
        name = originalObject.name;
        hireDate = originalObject.hireDate;
    }
    
    public String getName(){
        return name;
    }
    
    public String getHireDate(){
        return hireDate;
    }
    
    /**
     * Precondition newName is not null
     */
    public void setName(String newName){
        if(newName==null){
            System.out.println("Fatal Error setting employee name.");
            System.exit(0);
        }else
            name = newName;
    }
    
    /**
     * Precondition newDate is not null
     */
    public void setHireDate(String newDate){
        if(newDate==null){
            System.out.println("Fatal Error setting employee hire date.");
            System.exit(0);
        }else
            hireDate = newDate;
    }
    
    @Override
    public String toString(){
        return (name + " " + hireDate);
    }
    
    public boolean equals(Employee otherEmployee){
        return (name.equals(otherEmployee.name)&&hireDate.equals(otherEmployee.hireDate));
    }
}
