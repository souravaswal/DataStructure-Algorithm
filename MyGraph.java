#Smallest path from one cell to other cell of a 2-D matrix

public class RecursionProgram 
{
    public static void main(String args[])
    {
        int array[][] = {{1, 1, 1, 1},
                         {1, 0, 1, 1},
                         {1, 0, 1, 0},
                         {0, 1, 1, 1}
                         };
        int result = shortestPath(array, 0, 0, 1, 3);
        if(result >= 10000) 
        {
            System.out.println("No Valid Path Found");
        }
        else
        {
            System.out.println(result);
        } 
    }
    
    static int shortestPath(int a[][], int i, int j, int x, int y)
    {
        int rows = a.length;
        int columns = a[0].length;
        boolean visited[][] = new boolean[rows][columns];
        return shortestPath(a, i, j, x, y, visited);
    }

    static boolean isValid(int[][] a, int i, int j, boolean[][] visited)
    {
        int rows = a.length;
        int columns = a[0].length;
        return i >= 0 && j >= 0 && i < rows && j < columns && a[i][j] == 1 && !visited[i][j];
    }
    
    private static int shortestPath(int[][] a, int i, int j, int x, int y, boolean[][] visited) {
        // TODO Auto-generated method stub
        if(!isValid(a, i, j, visited)) return 10000;
        if(i == x && j == y) return 0;
        
        visited[i][j] = true;
        int left = shortestPath(a, i, j-1, x, y, visited) + 1;
        int right = shortestPath(a, i, j+1, x, y, visited) + 1;
        int top = shortestPath(a, i-1, j-1, x, y, visited) + 1;
        int bottom = shortestPath(a, i+1, j, x, y, visited) + 1;
		
		// Back Tracking 
        visited[i][j] = false;
        return Math.min(Math.min(left, right), Math.min(top, bottom));
    }
}