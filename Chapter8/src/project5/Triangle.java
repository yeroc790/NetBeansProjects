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
public class Triangle extends Figure{
    private int height;
    private int base;
    private int center;
    
    public Triangle(){
        super();
        height = 5;
        base = 5;
    }
    
//    public Triangle(int height, int base){
//        super();
//        this.height = height;
//        this.base = base;
//    }
    
    @Override 
    public void draw(int centerX, int centerY){ //generally zero
        super.draw(centerX, centerY);
        if((base<canvas.getNumCols())&&(height<canvas.getNumRows())){
            for (int rows = centerX; rows < (height + centerX); rows++) {
                for (int i = rows; i < (height + centerX); i++) {
                    for (int num_chars = 1; num_chars < (height + centerX); num_chars++) {
                        canvas.setChar('*', i, rows);
                    }
                }
            }
        }else{
            System.out.println("The shape is too large to draw on this canvas");
            System.exit(0);
        }
    }
    
    @Override
    public void center(){
        super.center();
        int centerCanvas = (int) canvas.getNumCols()/2;
        int centerShape = (int) base/2;
        
        int center = centerCanvas - centerShape; //accounting for the offset
        
        draw(center, center);
    }
}