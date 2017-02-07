/*
 * Class definition
 */
package classTest;

/**
 *
 * @author hansenc
 */
public class mainTest {
    public String month;
    public int day;
    public int year; //four digit number
    
    public void writeOutput()
    {
        System.out.println(month + " " + day + ", " + year);
    }
    
    // supposedly 'equals' and 'toString' are needed, but you can *probably* leave them out 
    public boolean equals(mainTest otherDate)
    {
        return ((month.equals(otherDate.month)) && (day == otherDate.day) && (year == otherDate.year));
    }
    
    public String toString()
    {
        return (month + " " + day + ", " + year);
    }
}
