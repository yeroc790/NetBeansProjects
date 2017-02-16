/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author hansenc
 */
public class Doodlebug extends Organism{
    public Doodlebug(){
        super();
        setType('X');
    }
    
    @Override
    public boolean move(){
        boolean canMove = super.move();
        int direction = getDirection();
        int row = getPos()[0], col = getPos()[1];
        
        if(canMove){
            return true; //it moved
        }else{
            switch (direction){
                case 0:
                    if(getPos()[0]>0){
                       if(getBoard()[(row-1)][col]=='a'){
                            //eat ant
                            setBoard('0', row, col);
                            setBoard('X', (row-1), col);
                            setNumAnts(getNumAnts()-1);
                            setPos((row-1),col);
                            canMove = true;
                            System.out.println("-- Ant Eaten --");
                        }else{
                            //wall or doodlebug, abort
                            canMove = false;
                        } 
                    }else{
                        canMove = false;
                    }
                    break;
                case 1:
                    if(getPos()[0]<19){
                        if(getBoard()[(row+1)][col]=='a'){
                            //eat ant
                            setBoard('0', row, col);
                            setBoard('X', (row+1), col);
                            setNumAnts(getNumAnts()-1);
                            setPos((row+1),col);
                            canMove = true;
                            System.out.println("-- Ant Eaten --");
                        }else{
                            //wall or doodlebug, abort
                            canMove = false;
                        }
                    }else{
                        return false;
                    }
                    break;
                case 2:
                    if(getPos()[1]>0){
                        if(getBoard()[row][(col-1)]=='a'){
                            //eat ant
                            setBoard('0', row, col);
                            setBoard('X', row, (col-1));
                            setNumAnts(getNumAnts()-1);
                            setPos(row, (col-1));
                            canMove = true;
                            System.out.println("-- Ant Eaten --");
                        }else{
                            //wall or doodlebug, abort
                            canMove = false;
                        }
                    }else{
                        return false;
                    }
                    break;
                case 3:
                    if(getPos()[1]<19){
                        if(getBoard()[row][(col+1)]=='a'){
                            //eat ant
                            setBoard('0', row, col);
                            setBoard('X', row, (col+1));
                            setNumAnts(getNumAnts()-1);
                            setPos(row, (col+1));
                            canMove = true;
                            System.out.println("-- Ant Eaten --");
                        }else{
                            //wall or doodlebug, abort
                            canMove = false;
                        }
                    }else{
                        return false;
                    }
                    break;
            }
            if(canMove){
                return true;
            }else{
                return false;
            }
        }
    }
}
