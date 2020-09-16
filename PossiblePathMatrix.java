#Possible paths to reach a matrix end in a n X m matrix.

public class RecursionProgram 
{
    public static void main(String args[])
    {
        RecursionProgram obj = new RecursionProgram();
        System.out.println(obj.path(1, 4));
    }

    private int path(int i, int j) {
        // TODO Auto-generated method stub
        if(i == 1 || j == 1)
        {
            return 1;
        }
        return path(i-1, j) + path(i, j-1);
    }
}