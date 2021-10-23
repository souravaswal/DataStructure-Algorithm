/**
Distribute minimum candies to the students such that one no two adjacent students are having equal number of candies.
**/
public class Solution 
{
    public int candy(int[] A) 
    {
        int candies[] = new int[A.length];
        candies[0] = 1;
        for(int i=1; i<candies.length; i++)
        {
            candies[i] = 1;
            if(A[i] > A[i-1])
            {
                candies[i] = candies[i-1] + 1; 
            }
        }
        
        for(int j=A.length-1; j>0; j--)
        {
            if((A[j-1] > A[j]) && (candies[j-1]<=candies[j]))
            {
                candies[j-1] = candies[j]+1;
            }
        }
        int sum = 0;
        for(int i=0; i<candies.length; i++)
        {
            sum = sum + candies[i];
        }
        return sum;
    }
}
