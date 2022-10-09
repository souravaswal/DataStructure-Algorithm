// This solution is for miceToHole problem
public class Solution {
    public int mice(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++)
        {
           int diff = Math.abs(A[i] - B[i]);
           if(diff > max){
               max = diff;
           }
        }
        return max;
    }
}
