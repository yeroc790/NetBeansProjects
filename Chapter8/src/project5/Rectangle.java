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
public class Rectangle extends Figure{
    private int height;
    private int width;
    private int center;
    
    public Rectangle(){
        super();
        height = 6; //looks like a rectangle because of inputs
        width = 5;
    }
    
    public Rectangle(int height, int width){
        super();
        this.height = height;
        this.width = width;
    }
    
    @Override 
    public void draw(int centerX, int centerY){
        super.draw(centerX, centerY);
        if((width<canvas.getNumCols())&&(height<canvas.getNumRows())){
            for (int rows = centerY; rows < (height + centerY); rows++) {
                for (int cols = centerX; cols < (width + centerX); cols++) {
                    canvas.setChar('*', rows, cols);
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
        int centerCanvasX = (int) canvas.getNumCols()/2;
        int centerShapeX = (int) width/2;
        int centerCanvasY = (int) canvas.getNumRows()/2;
        int centerShapeY = (int) height/2;
        
        int centerX = centerCanvasX - centerShapeX; //accounting for the offset
        int centerY = centerCanvasY - centerShapeY;
        
        draw(centerX, centerY);
    }
}
