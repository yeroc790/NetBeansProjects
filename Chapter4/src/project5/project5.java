/*
 * This projects
 */
package project5;


/**
 *
 * @author hansenc
 */
public class project5 {
    public static void main(String[] args) {
        int number = 1;
        Counter counter = new Counter();
        
        System.out.println("-- num set to zero by default");
        counter.displayNum();
        
        System.out.println("-- Adding 10 --");
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
        counter.displayNum();
        
        System.out.println("-- Subtracting 7 --");
        for (int i = 0; i < 7; i++) {
            counter.decrement();
        }
        counter.displayNum();
        
        System.out.println("-- Subtracting 5 --");
        for (int i = 0; i < 5; i++) {
            counter.decrement();
        }
        counter.displayNum();
        
        System.out.println("-- Adding 32 --");
        for (int i = 0; i < 32; i++) {
            counter.increment();
        }
        counter.displayNum();
        
        System.out.println("-- Extracting num to a local variable --");
        number = counter.getNum();
        System.out.println("number: " + number);
    }
}
