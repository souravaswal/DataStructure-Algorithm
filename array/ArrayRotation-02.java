#Rotate a 2-D Matrix with 90 degree without using another matrix (Important - Condition)

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
        for (int i = 0; i < length/2; i++) 
        {
            for (int j = i; j<length-i-1; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length-j-1][i];
                matrix[length-j-1][i] = matrix[length-i-1][length-j-1];
                matrix[length-i-1][length-j-1] = matrix[j][length-i-1];
                matrix[j][length-i-1] = temp;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
