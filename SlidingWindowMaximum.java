// Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum
{
    public int[] slidingWindowMaximum(int a[], int k)
    {
        int n = a.length;
        Deque<Integer> dq = new LinkedList<Integer>();
        int ans[] = new int[n-k+1];
        
        int i = 0;
        for(; i<k; i++)
        {
            while(!dq.isEmpty() && a[dq.peekLast()] <=a[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        
        for(; i<n; i++)
        {
            ans[i-k] = a[dq.peekFirst()];
            
            while(!dq.isEmpty() && dq.peekFirst() <= (i-k))
            {
                dq.removeFirst();
            }
            
            while(!dq.isEmpty() && a[dq.peekLast()] <= a[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i-k] = a[dq.peekFirst()];
        return ans;
    }
    public static void main(String args[])
    {
        int a[] = {1, 3, -1, -3, 5, 3, 6, 7};
        SlidingWindowMaximum obj = new SlidingWindowMaximum();
        int answer[] = obj.slidingWindowMaximum(a, 3);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}