/*
 * A complex number is written in the form: a + b*i, where i = sqrt(-1)
 */
package project7;

import java.text.DecimalFormat;

/**
 * This class performs operations on complex numbers of the form a + b*i, where i = sqrt(-1)
 * @author hansenc
 */
public class Complex {
    private double real;
    private double imaginary;
    
    /* -- Begin Constructors -- */

    /**
     * Sets both the real and imaginary parts of the complex number
     * @param a Real number
     * @param b Imaginary number
     */

    public Complex(double a, double b){
        real = a;
        imaginary = b;
    }
    
    /**
     * Sets only the real part of the complex number, setting the imaginary part to 0
     * @param realPart Real number
     */
    public Complex(double realPart){
        real = realPart;
        imaginary = 0;
    }
    
    /**
     * Sets both the real and imaginary parts of the complex number to 0
     */
    public Complex(){
        real = 0;
        imaginary = 0;
    }
    /* -- End Constructors -- */
    
    /* -- Begin Modifiers -- */

    /**
     * Sets the real part of the complex number to 'a'
     * @param a Real number
     */

    public void setReal(double a){
        real = a;
    }
    
    /**
     * Sets the imaginary part of the complex number to 'b'
     * @param b Imaginary number
     */
    public void setImaginary(double b){
        imaginary = b;
    }
    /* -- End Modifiers -- */
    
    /* -- Begin Accessors -- */

    /**
     * Returns the real part of the complex number
     * @return Real number
     */

    public double getReal(){ //haha get real
        return real;
    }
    
    /**
     * Returns the imaginary part of the complex number
     * @return Imaginary number
     */
    public double getImaginary(){
        return imaginary;
    }
    
    /**
     * Displays the complex number in a simplified form
     */
    public void displayComplex(){
        DecimalFormat num = new DecimalFormat("0");
        if(imaginary>0){
            System.out.println(num.format(real) + " + " + num.format(imaginary) + "i");
        }else if(imaginary<0){
            System.out.println(num.format(real) + " - " + num.format((imaginary*(-1))) + "i");
        }else{
            System.out.println(num.format(real));
        }
    }
    /* -- End Accessors -- */
    
    /* -- Begin Static Methods -- */

    /**
     * Performs the addition of two complex numbers
     * @param c1 First complex number
     * @param c2 Second complex number
     * @return The sum of 'c1' and 'c2' stored in a new object of type Complex
     */

    public static Complex add(Complex c1, Complex c2){
        Complex sum = new Complex();
        double realSum, imgSum;
        double real1 = c1.getReal(), real2 = c2.getReal();
        double img1 = c1.getImaginary(), img2 = c2.getImaginary();
        
        realSum = real1 + real2;
        imgSum = img1 + img2;
        
        sum.setReal(realSum);
        sum.setImaginary(imgSum);
        return sum;
    }
    
    /**
     * Performs the subtraction of two complex numbers in the form 'c1' - 'c2'
     * @param c1 First complex number
     * @param c2 Second complex number
     * @return The difference of 'c1' and 'c2' stored in a new object of type Complex
     */
    public static Complex subtract(Complex c1, Complex c2){ //c1 - c2
        Complex diff = new Complex();
        double realDiff, imgDiff;
        double real1 = c1.getReal(), real2 = c2.getReal();
        double img1 = c1.getImaginary(), img2 = c2.getImaginary();
        
        realDiff = real1 - real2;
        imgDiff = img1 - img2;
        
        diff.setReal(realDiff);
        diff.setImaginary(imgDiff);
        return diff;
    }
    
    /**
     * Performs the multiplication of two complex numbers
     * @param c1 First complex number
     * @param c2 Second complex number
     * @return The product of 'c1' and 'c2' stored in a new object of type Complex
     */
    public static Complex multiply(Complex c1, Complex c2){
        Complex product = new Complex();
        double realProduct, imgProduct;
        double a = c1.getReal(), c = c2.getReal();
        double b = c1.getImaginary(), d = c2.getImaginary();
        
        //(a + b*i)*(c + d*i) = (a*c - b*d) + (a*d + b*c)*i
        realProduct = (a*c)-(b*d);
        imgProduct = (a*d)+(b*c);
                
        product.setReal(realProduct);
        product.setImaginary(imgProduct);
        return product;
    }
    /* -- End Static Methods -- */
    
    /* -- Begin Dynamic Methods -- */

    /**
     * Adds this object's complex number to another, changing the value of the object that called the method
     * @param c2 Another complex number
     */

    public void add(Complex c2){
        Complex sum = new Complex();
        double realSum, imgSum;
        double real1 = real, real2 = c2.getReal();
        double img1 = imaginary, img2 = c2.getImaginary();
        
        realSum = real1 + real2;
        imgSum = img1 + img2;
        
        real = realSum;
        imaginary = imgSum;
    }
    
    /**
     * Subtracts this object's complex number from another in the form 'this' - 'c2', changing the value of the object that called the method
     * @param c2 Another complex number
     */
    public void subtract(Complex c2){ //c1 - c2
        Complex diff = new Complex();
        double realDiff, imgDiff;
        double real1 = real, real2 = c2.getReal();
        double img1 = imaginary, img2 = c2.getImaginary();
        
        realDiff = real1 - real2;
        imgDiff = img1 - img2;
        
        real = realDiff;
        imaginary = imgDiff;
    }
    
    /**
     * Multiplies this object's complex number with another, changing the value of the object that called the method
     * @param c2 Another complex number
     */
    public void multiply(Complex c2){
        Complex product = new Complex();
        double realProduct, imgProduct;
        double a = real, c = c2.getReal();
        double b = imaginary, d = c2.getImaginary();
        
        //(a + b*i)*(c + d*i) = (a*c - b*d) + (a*d + b*c)*i
        realProduct = (a*c)-(b*d);
        imgProduct = (a*d)+(b*c);
                
        real = realProduct;
        imaginary = imgProduct;
    }
    /* -- End Dynamic Methods -- */
}
