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
public class Canvas {
    char[][] canvas;
    private int num_rows;
    private int num_cols;
    
    public Canvas(){
        canvas = new char[50][50];
        num_rows = 50;
        num_cols = 50;
        blankCanvas();
    }
    
    public Canvas(int rows, int cols){
        if((rows<=10)||(cols<=10)){
            System.out.println("Error: Canvas is too small");
            System.exit(0);
        }else{
            canvas = new char[rows][cols];
            num_rows = rows;
            num_cols = cols;
            blankCanvas();
        }
    }
    
    public void blankCanvas(){
        for (int row = 0; row < num_rows; row++) {
            for (int col = 0; col < num_cols; col++) {
                canvas[row][col] = ' '; //blank
            }
        }
    }
    
    public void setChar(char x, int row, int col){
        try{
            canvas[row][col] = x;
        }catch(Exception e){
            System.out.println("Error setting char: " + e);
            System.exit(0);
        }
    }
    
    public void display(){
        String border = "";
        for (int i = 0; i < num_cols; i++) {
            border+= "--"; //two because of the space in the output
        }
        System.out.println(border);
        for (int row = 0; row < num_rows; row++) {
            for (int col = 0; col < num_cols; col++) {
                System.out.print(canvas[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(border);
    }
    
    public int getNumRows(){
        return num_rows;
    }
    
    public int getNumCols(){
        return num_cols;
    }
}
