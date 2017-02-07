/**
 * Complex number operations
 */
package project7;


/**
 * This class uses Complex
 * @author hansenc
 */
public class project7 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3,2);
        Complex c2 = new Complex(5,0);
        Complex operations = new Complex();
        
        System.out.println("\n-- c1 --");
        c1.displayComplex();
        
        System.out.println("\n-- c2 --");
        c2.displayComplex();
        
        System.out.println("\n-- sum --");
        operations = Complex.add(c1, c2);
        operations.displayComplex();
        
        System.out.println("\n-- difference --");
        operations = Complex.subtract(c1, c2);
        operations.displayComplex();
        
        System.out.println("\n-- product --");
        operations = Complex.multiply(c1, c2);
        operations.displayComplex();
    }
}
