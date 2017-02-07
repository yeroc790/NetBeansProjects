/**
 * Rational number operations
 */
package project6;

/**
 *
 * @author hansenc
 */
public class project6 {
    public static void main(String[] args) {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(3,4);
        Rational operation = new Rational();
        
        System.out.println("\n-- r1 --");
        r1.displayRational();
        
        System.out.println("\n-- r2 --");
        r2.displayRational();
        
        System.out.println("\n-- sum --");
        operation = Rational.add(r1, r2);
        operation.displayRational();
        
        System.out.println("\n-- difference --");
        operation = Rational.subtract(r1, r2);
        operation.displayRational();
        
        System.out.println("\n-- product --");
        operation = Rational.multiply(r1, r2);
        operation.displayRational();
        
        System.out.println("\n-- quotient --");
        operation = Rational.divide(r1, r2);
        operation.displayRational();
    }
}
