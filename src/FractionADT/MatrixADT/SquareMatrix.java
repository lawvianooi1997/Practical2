/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FractionADT.MatrixADT;

/**
 *
 * @author User
 */
public class SquareMatrix implements MatrixInterface {
    
    private int[][] intArray;
    
    public SquareMatrix(int capacity){
        intArray = new int[capacity][capacity];
    }

    @Override
    public boolean storValue(int i, int j, int value) {
        
        boolean successful = false;
        
        if(i >= 1 && i <= intArray.length && j >= 1 && j <= intArray[i-1].length)
        {
            this.intArray[i-1][j-1] = value;
            successful = true;
        }
        
        return successful;
    }

    @Override
    public String toString() {
        
        String output = "";
        
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray[i].length; j++)
            {
                output += String.format("%4d", intArray[i][j]);
            }
            
            output += "\n";
        }
      
        return output;
    }
    
    
    
    public static void main(String[] args){
        
        
        MatrixInterface matA = new SquareMatrix(3);
        
        //Testing value is inserted or not
        System.out.println(matA.storValue(1, 1, 0));
        System.out.println(matA.storValue(1, 2, 1));
        System.out.println(matA.storValue(1, 3, 3));
        System.out.println(matA.storValue(2, 1, 4));
        System.out.println(matA.storValue(2, 2, 5));
        System.out.println(matA.storValue(2, 3, 9));
        System.out.println(matA.storValue(3, 1, 2));
        System.out.println(matA.storValue(3, 2, 8));
        System.out.println(matA.storValue(3, 3, 7));
        
        System.out.println();
        
        //Print out the Matrix 3*3
        System.out.println(matA);
    }
    
    
}
