// Take a M X N matrix and print the elements in spiral order.

import java.util.*;
import java.util.ArrayList;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int size = A.length * A[0].length;
        int[] array = new int[size];
        List<Integer> list = new ArrayList<Integer>();
        int row_start = 0;
        int row_end = A.length;
        int col_start = 0;
        int col_end = A[0].length;
        
        while(row_start < row_end && col_start < col_end)
        {
            for(int i=col_start; i<col_end; i++)
            {
                list.add(A[row_start][i]);
            }
            row_start++;
            
            for(int i=row_start; i<row_end; i++)
            {
                list.add(A[i][col_end-1]);
            }
            col_end--;
            
            if(row_start < row_end)
            {
                for(int i = col_end-1; i>=col_start; i--)
                {
                    list.add(A[row_end-1][i]);
                }
                row_end--;
            }
            
            if(col_start < col_end)
            {
                for(int i=row_end-1; i>=row_start; i--)
                {
                    list.add(A[i][col_start]);
                }
                col_start++;
            }
        }
        for(int i=0; i<list.size(); i++)
        {
            array[i] = list.get(i);
        }
        //list.toArray(array);
        return array;
    }
}
