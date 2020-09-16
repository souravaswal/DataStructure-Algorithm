public class PossiblePathsinMatrix 
{
    public static void main(String[] args) 
    {
        System.out.println(PossiblePaths(1, 3));
    }
    
    static int PossiblePaths(int i, int j)
    {
        if(i==1 || j==1)
        {
            return 1;
        }
        return PossiblePaths(i-1, j) + PossiblePaths(i, j-1); 
    }
}
