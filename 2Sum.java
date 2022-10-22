/**

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based.
Put both these numbers in order in an array and return the array from your function (Looking at the function signature will make things clearer). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

Input: [2, 7, 11, 15], target=9
Output: index1 = 1, index2 = 2

**/

public class Solution {
    // PLEASE DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] twoSum(final int[] A, int B) {
        int min_first = Integer.MAX_VALUE, min_second = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean flag = false;
        //[1 , -3 , 6 , 4 , 2] 
        //B = 3
        for(int i=0; i<A.length; i++)
        {
            int sol = B - A[i];
            if(map.containsKey(sol))
            {
                if(i+1 < min_second)
                {
                    min_second = i+1;
                    min_first = map.get(sol);
                }
                else if(i+1 == min_second)
                {
                    if(map.get(sol) < min_first)
                    {
                        //min_second = i+1;
                        min_first = map.get(sol);
                    }
                }
                flag = true;
            }
            else
            {
                map.putIfAbsent((Integer)(A[i]) ,(Integer)(i+1));
            }
        }
        if(flag)
        {
            return new int[] {min_first, min_second};
        }
        else
        {
            return new int[] {};    
        }
    }
}


