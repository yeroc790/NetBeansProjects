/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.Random;

/**
 *
 * @author hansenc
 */
public abstract class Organism {
    private static char board[][] = new char[20][20];
    private int pos[] = new int[2]; //position for row and column, index 0: row, index 1: col
    
    public Organism(){
        //foo
    }
    
    public static void populateBoard(int numAnts, int numBugs, Doodlebug[] bug, Ant[] ant){
        int randRow, randCol;
        int bIndex = 0;
        int aIndex = 0;
        
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 20; col++) {
                board[row][col] = '0'; //set to empty
            }
        }
        for (int ants = 0; ants < numAnts; ants++) {
            randRow = getRandomNum(19,0);
            randCol = getRandomNum(19,0);
            if(board[randRow][randCol]=='0'){
                board[randRow][randCol] = 'a'; //put an ant there
                ant[aIndex].setPos(randRow, randCol); //position set
                aIndex++;
            }else{
                ants--; //retry
            }
        }
        for (int bugs = 0; bugs < numBugs; bugs++) {
            randRow = getRandomNum(19,0);
            randCol = getRandomNum(19,0);
            if (board[randRow][randCol]=='0'){
                board[randRow][randCol] = 'X'; //put a doodlebug there
                bug[bIndex].setPos(randRow, randCol); //position set
                bIndex++;
            }else{
                bugs--; //retry
            }
        }
    }
    
    public static void displayBoard(){
        char temp;
        System.out.println();
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 20; col++) {
                temp = board[row][col];
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
    
    private static int getRandomNum(int max, int min){
        Random rand = new Random();
        int random = rand.nextInt(max) + min;
        return random;
    }
    
    public void setPos(int row, int col){
        pos[0] = row;
        pos[1] = col;
    }
    
    public int[] getPos(){
        return pos;
    }
    
    public void move(){ //defaults to ant movement, bug will override
        //randomize number to determine if you want to move up(0), down(1), left(2), or right(3)
        int direction = getRandomNum(3,0);
        boolean canMove = false;
        switch (direction){
            case 0:
                canMove = canMoveUp();
                break;
            case 1:
                canMove = canMoveDown();
                break;
            case 2:
                canMove = canMoveLeft();
                break;
            case 3:
                canMove = canMoveRight();
                break;
        }
        
        //use canMove to determine the move
    }
    
    private boolean canMoveUp(){ //true if can move
        int row = pos[0], col = pos[1];
        if(row==0){
            return false;
        }else if((board[(row-1)][col]=='X')||board[(row-1)][col]=='a'){//spot is taken
            return false;
        }
        return true;
    }
    
    private boolean canMoveDown(){
        int row = pos[0], col = pos[1];
        if(row==19){
            return false;
        }else if((board[(row+1)][col]=='X')||board[(row+1)][col]=='a'){//spot is taken
            return false;
        }
        return true;
    }
    
    private boolean canMoveLeft(){
        int row = pos[0], col = pos[1];
        if(col==0){
            return false;
        }else if((board[(row)][col-1]=='X')||board[(row)][col-1]=='a'){//spot is taken
            return false;
        }
        return true;
    }
    
    private boolean canMoveRight(){
        int row = pos[0], col = pos[1];
        if(col==19){
            return false;
        }else if((board[(row)][col+1]=='X')||board[(row)][col+1]=='a'){//spot is taken
            return false;
        }
        return true;
    }
}
