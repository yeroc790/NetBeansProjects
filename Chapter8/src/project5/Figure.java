/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

/**
 *
 * @author hansenc
 */
public class Figure {
    protected Canvas canvas;
    
    public Figure(){
        canvas = new Canvas();
    }
    
    public Figure(int rows, int cols){
        canvas = new Canvas(rows, cols);
    }
    
    public void erase(){
        System.out.println("Erasing");
        canvas.blankCanvas();
    }
    
    public void draw(int centerX, int centerY){ //generally 0
        System.out.println("Drawing");
    }
    
    public void center(){
        erase();
//        draw(0,0);
        System.out.println("Centering");
    }
    
    public void display(){
        canvas.display();
    }
}
