/*
 * This is a base class for projects 4 and 5
 */
package reference;

/**
 *
 * @author hansenc
 */
public class SalariedEmployee extends Employee{
    private double salary; //annual
    
    public SalariedEmployee(){
        super();
        salary = 0;
    }
    
    /**
     * Precondition: Neither theName nor theDate is null
     */
    public SalariedEmployee(String theName, String theDate, double theSalary){
        super(theName, theDate);
        if(theSalary >= 0)
            salary = theSalary;
        else{
            System.out.println("Fatal Error: Negative salary.");
            System.exit(0);
        }
    }
    
    public SalariedEmployee(SalariedEmployee originalObject){
        super(originalObject);
        salary = originalObject.salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    /**
     * Returns pay for the month
     */
    public double getPay(){
        return salary/12;
    }
    
    /**
     * Precondition: newSalary is nonnegative
     */
    public void setSalary(double newSalary){
        if(newSalary >= 0)
            salary = newSalary;
        else{
            System.out.println("Fatal Error: Negative salary.");
            System.exit(0);
        }
    }
    
    @Override
    public String toString(){
        return (getName() + " " + getHireDate() + "\n$" + salary + " per year");
    }
    
    public boolean equals(SalariedEmployee other){
        return (getName().equals(other.getName()) && getHireDate().equals(other.getHireDate()) && salary == other.salary);
    }
}
