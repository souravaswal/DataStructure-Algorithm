#Given an array check if sub-array with sum zero exists or not using HashSet

import java.util.HashSet;
import java.util.Set;

public class ZeroSubArray {
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        int array[] = {2, 1, 3, 4, 2, 0};
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i < array.length; i++) 
        {
            set.add(sum);
            sum+=array[i];
            if(set.contains(sum))
            {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
}