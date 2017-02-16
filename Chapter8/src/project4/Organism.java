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
    private char type = 'z'; //will be changed in derived classes
    private int direction = 0;
    private static int numAnts = 100;
    private static int numBugs = 5;
    
    public Organism(){
        //foo
    }
    
    /* -- Begin Accessors -- */
    public static int getNumAnts(){
        return numAnts;
    }
    
    public static int getNumBugs(){
        return numBugs;
    }
    
    public int[] getPos(){
        return pos;
    }
    
    public char[][] getBoard(){
        return board;
    }
    
    public int getDirection(){
        return direction;
    }
    /* -- End Accessors -- */
    
    /* -- Begin Mutators -- */
    public void setType(char type){
        this.type = type;
    }
    
    public void setPos(int row, int col){
        pos[0] = row;
        pos[1] = col;
    }

    public void setBoard(char x, int row, int col){
        board[row][col] = x;
    }
    
    public void setNumBugs(int num){
        numBugs = num;
    }
    
    public void setNumAnts(int num){
        numAnts = num;
    }
    /* -- End Mutators -- */
    
    /* -- Begin Board Methods -- */
    public static void populateBoard(Doodlebug[] bug, Ant[] ant){
        int randRow, randCol;
        int bIndex = 0;
        int aIndex = 0;
        int numAnts = ant.length;
        int numBugs = bug.length;
        
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
    /* -- End Board Methods -- */
    
    /* -- Begin Organism Actions -- */
    public boolean move(){ //defaults to ant movement, bug will override
        //randomize number to determine if you want to move up(0), down(1), left(2), or right(3)
        direction = getRandomNum(4,0);
//        System.out.println("Direction: " + direction);
        int row = pos[0], col = pos[1];
        boolean canMove = false;
        
        switch (direction){
            case 0:
                canMove = canMoveUp();
                if(canMove){
//                    board[row][col] = '0';                    
//                    board[(row-1)][col] = type; 
                    setBoard('0', row, col);
                    setBoard(type, (row-1), col);
                    pos[0] = row-1;
                }
                break;
            case 1:
                canMove = canMoveDown();
                if(canMove){
//                    board[row][col] = '0';
//                    board[(row+1)][col] = type; 
                    setBoard('0', row, col);
                    setBoard(type, (row+1), col);
                    pos[0] = row+1;
                }
                break;
            case 2:
                canMove = canMoveLeft();
                if(canMove){
//                    board[row][col] = '0';
//                    board[row][(col-1)] = type; 
                    setBoard('0', row, col);
                    setBoard(type, row, (col-1));
                    pos[1] = col-1;
                }
                break;
            case 3:
                canMove = canMoveRight();
                if(canMove){
//                    board[row][col] = '0';
//                    board[row][(col+1)] = type;
                    setBoard('0', row, col);
                    setBoard(type, row, (col+1));
                    pos[1] = col+1;
                }
                break;
        }
        if(canMove){
            return true;
        }else{
            return false;
        }
    }
    /* -- End Organism Actions -- */
    
    /* -- Begin Other Methods -- */
    public boolean canMoveUp(){ //true if can move
        int row = pos[0], col = pos[1];
        if(row==0){
            return false;
        }else if((board[(row-1)][col]=='X')||board[(row-1)][col]=='a'){//spot is taken
            return false;
        }
        return true;
    }
    
    public boolean canMoveDown(){
        int row = pos[0], col = pos[1];
        if(row==19){
            return false;
        }else if((board[(row+1)][col]=='X')||board[(row+1)][col]=='a'){//spot is taken
            return false;
        }
        return true;
    }
    
    public boolean canMoveLeft(){
        int row = pos[0], col = pos[1];
        if(col==0){
            return false;
        }else if((board[(row)][col-1]=='X')||board[(row)][col-1]=='a'){//spot is taken
            return false;
        }
        return true;
    }
    
    public boolean canMoveRight(){
        int row = pos[0], col = pos[1];
        if(col==19){
            return false;
        }else if((board[(row)][col+1]=='X')||board[(row)][col+1]=='a'){//spot is taken
            return false;
        }
        return true;
    }
     
    private static int getRandomNum(int max, int min){
        Random rand = new Random();
        int random = rand.nextInt(max) + min;
        return random;
    }
    
    public boolean isNotDead(){
        if(board[pos[0]][pos[1]]=='0'){
            return false;
        }else{
            return true;
        }
    }
    /* -- End Other Methods -- */
}
