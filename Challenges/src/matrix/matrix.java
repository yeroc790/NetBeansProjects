/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author hansenc
 */
public class matrix {
    public static void main(String[] args) {
        boolean matrix[][] = new boolean[4][4];
        boolean result[][] = new boolean[4][4];
        boolean and[] = new boolean[4]; //stores AND results for the matrix
        boolean temp = false; //stores the OR of all the elements in 'and[]'
        
        /* -- Initializing -- */
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if((col==1)||(col==3)){
                    matrix[row][col] = false;
                }else{
                    matrix[row][col] = true;
                }
            }
        }
        
        /* -- Display initial array -- */
        System.out.println("\nInitial Matrix:");
        displayBoolArray(matrix);
        
        /* -- Perform operation -- */
        for (int slow = 0; slow < 4; slow++) {
            for (int med = 0; med < 4; med++) {
                temp = false;
                /* -- Calculating the 4 ANDs -- */
                for (int fast = 0; fast < 4; fast++) {
                    and[fast] = matrix[slow][fast] && matrix[fast][med];
                    //for int array
                    //if(matrix[slow][fast] + matrix[fast][med]==2){
                    //  and[fast] = 1;
                    //}else{
                    //  and[fast] = 0;
                    //}
                }
                
                /* -- Taking the OR of the AND products to get the final bit -- */
                for (int index = 0; index < 4; index++) {
                    temp = temp||and[index]; //initially (false OR sum[index])
                    //for int array
                    //temp = temp + and[index];
                }
                //for int array
                //if(temp>0){
                //  result[slow][med] = 1;
                //}else
                //  result[slow][med] = 0;
                //}
                result[slow][med] = temp;
            }
        }
        
        /* -- Display array after operation -- */
        System.out.println("\nArray after operation:");
        displayBoolArray(result);
    }
    
    public static void displayBoolArray(boolean[][] a){
        int copy[][] = new int[a.length][a[0].length];
        
        /* -- Copying -- */
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                if(a[row][col]==true){
                    copy[row][col] = 1;
                }else{
                    copy[row][col] = 0;
                }
            }
        }
        
        /* -- Output -- */
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(copy[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public static void displayBool(boolean b){
        int num;
        if(b){
            num = 1;
        }else{
            num = 0;
        }
        
        System.out.print(num);
    }
}
