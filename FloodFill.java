#Fill the desired number to all the connected cells of a specific location in a matrix

public class RecursionProgram 
{
    public static void main(String args[])
    {
        int array[][] = {{1, 1, 1, 1, 1, 1, 1, 1}, 
                         {1, 1, 1, 1, 1, 1, 0, 0},
                         {1, 0, 0, 1, 1, 0, 1, 1}, 
                         {1, 2, 2, 2, 1, 2, 1, 2},
                         {1, 3, 3, 4, 5, 1, 1, 1}
                         };
        floodFill(array, 4, 5, 9, 1);
        printMatrix(array);
    }
    
    static void floodFill(int a[][], int r, int c, int toFill, int prevFill)
    {
        int rows = a.length;
        int columns = a[0].length;
        
        if(r < 0 || r >= rows || c >= columns || c < 0)
        {
            return;
        }
        if(a[r][c] != prevFill)
        {
            return;
        }
        a[r][c] = toFill;
        floodFill(a, r-1, c, toFill, prevFill);
        floodFill(a, r, c-1, toFill, prevFill);
        floodFill(a, r+1, c, toFill, prevFill);
        floodFill(a, r, c+1, toFill, prevFill);
    }
    
    static void printMatrix(int a[][])
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
