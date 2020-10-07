/**


Problem Description

Given an integer array A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


Problem Constraints

1 <= |A| <= 100000


Input Format

The only argument given is integer array A.


Output Format

Return the total water it is able to trap after raining.


Example Input

Input 1:

 A = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]

Input 2:

 A = [1, 2]



Example Output

Output 1:

 6

Output 2:

 0



Example Explanation

Explanation 1:

 
 In this case, 6 units of rain water (blue section) are being trapped.

Explanation 2:

 No water is trapped.




**/

public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) 
    {
        int res = 0;
        for(int i=1; i<A.length-1; i++)
        {
            int left = A[i];
            for(int j=0; j<i; j++)
            {
                left = Math.max(A[j], left);
            }
            
            int right = A[i];
            for(int j=i+1; j<A.length; j++)
            {
                right = Math.max(A[j], right);
            }
            
            res+=Math.min(left, right)- A[i];
        }
        return res;
    }
}

