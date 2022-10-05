#Rotate a 2-D Matrix with 90 degree using another matrix.

import java.util.ArrayList;
import java.util.List;

public class TestQuestions 
{
    public static void main(String[] args) 
    {
        int matrix[][] = {{1, 2, 3, 4, 5}, 
                          {6, 7, 8, 9, 10},
                          {11, 12, 13, 14, 15},
                          {16, 17, 18, 19, 20},
                          {21, 22, 23, 24, 25}};
        
        System.out.println("Replacing the matrix: ");
        int length = matrix.length;
        int RotatedMatrix[][] = new int[length][length];
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < RotatedMatrix.length; j++) 
            {
                RotatedMatrix[j][length-1-i] = matrix[i][j];
            }
        }
        for (int i = 0; i < RotatedMatrix.length; i++) 
        {
            for (int j = 0; j < RotatedMatrix.length; j++) 
            {
                System.out.print(RotatedMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
