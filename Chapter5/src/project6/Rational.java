/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

/**
 *
 * @author hansenc
 */
public class Rational {
    private int num; //numerator
    private int den; //denominator
    
    /* -- Begin Constructors -- */
    public Rational(){ //sets fraction to 1
        num = 1;
        den = 1;
    }
    
    public Rational(int newNum){
        if(newNum!=0){
            num = newNum;
            den = 1;
        }else{
            num = 1;
            den = 1;
        }
    }
    
    public Rational(int newNum, int newDen){
        //rationalizing sign
        if(newDen<0){
            newDen *= -1;
            newNum *= -1;
        }
        
        if(newNum!=0){
            num = newNum;
            den = newDen;
        }else{
            num = 1;
            den = 1;
        }
    }
    /* -- End Constructors -- */
    
    /* -- Begin Modifiers -- */
    public void setNum(int newNum){
        if(newNum!=0){
            num = newNum;
        }else{
            num = 1;
        }
    }
    
    public void setDen(int newDen){
        if(newDen<0){
            newDen *= -1;
            num *= -1;
        }
        den = newDen;
    }
    /* -- End Modifiers -- */
    
    /* -- Begin Accessors -- */
    public int getNum(){
        return num;
    }
    
    public int getDen(){
        return den;
    }
    
    public void displayRational(){
        System.out.println("Fraction: " + num + "/" + den);
    }
    /* -- End Accessors -- */
    
    /* -- Begin Static Methods -- */
    public static Rational add(Rational r1, Rational r2){
        Rational sum = new Rational();
        int numSum = 0, newDen = 0;
        r1 = simplify(r1.getNum(),r1.getDen());
        r2 = simplify(r2.getNum(),r2.getDen());
        int num1 = r1.getNum(), num2 = r2.getNum();
        int den1 = r1.getDen(), den2 = r2.getDen();
        
        if(den1!=den2){
            newDen = den1*den2; 
            num1 = num1*den2;
            num2 = num2*den1;
            
            numSum = num1+num2;
        }else{
            //denominators are the same
            numSum = num1 + num2;
            newDen = den1;
        }
        
        sum = simplify(numSum, newDen);
        return sum;
    }
    
    public static Rational subtract(Rational r1, Rational r2){ // r1 - r2
        Rational diff = new Rational();
        int numDiff, newDen;
        r1 = simplify(r1.getNum(),r1.getDen());
        r2 = simplify(r2.getNum(),r2.getDen());
        int num1 = r1.getNum(), num2 = r2.getNum();
        int den1 = r1.getDen(), den2 = r2.getDen();
        
        if(den1!=den2){
            newDen = den1*den2;
            num1 = num1*den2;
            num2 = num2*den1;
            
            numDiff = num1-num2;
        }else{
            numDiff = num1 - num2;
            newDen = den1;
        }
        
        diff = simplify(numDiff, newDen);
        return diff;
    }
    
    public static Rational multiply(Rational r1, Rational r2){
        Rational product = new Rational();
        int numProduct, denProduct;
        int num1 = r1.getNum(), num2 = r2.getNum();
        int den1 = r1.getDen(), den2 = r2.getDen();
        
        numProduct = num1*num2;
        denProduct = den1*den2;
        
        product = simplify(numProduct,denProduct);
        return product;
    }
    
    public static Rational divide(Rational r1, Rational r2){
        //division of fractions is inverse multiplication
        Rational quotient = new Rational();
        int numProduct, denProduct;
        int num1 = r1.getNum(), num2 = r2.getDen(); //num2 and den2 are purposefully flipped
        int den1 = r1.getDen(), den2 = r2.getNum(); 
        
        numProduct = num1*num2;
        denProduct = den1*den2;
        
        quotient = simplify(numProduct, denProduct);
        return quotient;
    }
    
    public static Rational simplify(int num, int den){
        Rational simple = new Rational();
        
        if((num%den)==0){ //whole number
            num = num/den;
            den = 1;
        }
        
        for (int i = 2; i <= 7; i++) { //simplifies by dividing both num and den by numbers from 2-7 until it can't go any further
            while((num%i==0)&&(den%i==0)){
                num /= i;
                den /= i;
            }
        }
        
        //rationalizing sign
        if(den<0){
            den *= -1;
            num *= -1;
        }
        simple.setNum(num);
        simple.setDen(den);
        return simple;
    }
    
    public static boolean equals(Rational r1, Rational r2){
        int num1 = r1.getNum(), num2 = r2.getNum();
        int den1 = r1.getDen(), den2 = r2.getDen();
        int cross1, cross2;
        cross1 = num1*den2;
        cross2 = num2*den1;
        return(cross1==cross2);
    }
    /* -- End Static Methods -- */
    
    /* -- Begin Dynamic Methods -- */
    public void add(Rational r2){
        Rational diff = new Rational();
        int numSum = 0, newDen = 0;
        r2 = simplify(r2.getNum(),r2.getDen());
        int num1 = num, num2 = r2.getNum();
        int den1 = den, den2 = r2.getDen();
        
        if(den1!=den2){
            newDen = den1*den2; 
            num1 = num1*den2;
            num2 = num2*den1;
            
            numSum = num1+num2;
        }else{
            //denominators are the same
            numSum = num1 + num2;
            newDen = den1;
        }
        
        diff = simplify(numSum,newDen);
        num = diff.getNum();
        den = diff.getDen();
    }
    
    public void subtract(Rational r2){ // r1 - r2
        Rational diff = new Rational();
        int numDiff, newDen;
        r2 = simplify(r2.getNum(),r2.getDen());
        int num1 = num, num2 = r2.getNum();
        int den1 = den, den2 = r2.getDen();
        
        if(den1!=den2){
            newDen = den1*den2;
            num1 = num1*den2;
            num2 = num2*den1;
            
            numDiff = num1-num2;
        }else{
            numDiff = num1 - num2;
            newDen = den1;
        }
        
        diff = simplify(numDiff, newDen);
        num = diff.getNum();
        den = diff.getDen();
    }
    
    public void multiply(Rational r2){
        Rational product = new Rational();
        int numProduct, denProduct;
        int num1 = num, num2 = r2.getNum();
        int den1 = den, den2 = r2.getDen();
        
        numProduct = num1*num2;
        denProduct = den1*den2;
        
        product = simplify(numProduct,denProduct);
        num = product.getNum();
        den = product.getDen();
    }
    
    public void divide(Rational r2){
        //division of fractions is inverse multiplication
        Rational quotient = new Rational();
        int numProduct, denProduct;
        int num1 = num, num2 = r2.getDen(); //num2 and den2 are purposefully flipped
        int den1 = den, den2 = r2.getNum(); 
        
        numProduct = num1*num2;
        denProduct = den1*den2;
        
        quotient = simplify(numProduct, denProduct);
        num = quotient.getNum();
        den = quotient.getDen();
    }
    /* -- End Dynamic Methods -- */
}
