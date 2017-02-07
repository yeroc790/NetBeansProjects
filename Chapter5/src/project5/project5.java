/**
 * Money
 */
package project5;

/**
 *
 * @author hansenc
 */
public class project5 {
    public static void main(String[] args) {
        Money m1 = new Money(2,50);
        Money m2 = new Money(3,41);
        Money sum = new Money();
        Money difference = new Money();
        
        System.out.println("-- M1 --");
        m1.displayMoney();
        
        System.out.println("-- M2 --");
        m2.displayMoney();
        
        System.out.println("-- Sum --");
        sum = sum.add(m1, m2);
        sum.displayMoney();
        
        System.out.println("-- Difference --");
        difference = difference.subtract(m2, m1);
        difference.displayMoney();
    }
}
