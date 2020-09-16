#Check if sub-arrays with equal sum exists or not

import java.util.ArrayList;

public class RecursionProgram 
{
    public static void main(String args[])
    {
        int array[] = {1, 3, 5, 1, 0, 2, 4, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        partition(array, sum/2, 0, al);
        System.out.println(al);
    }
    
    static boolean partition(int arr[], int sum , int i, ArrayList<Integer> al)
    {
        if(sum < 0 || i >= arr.length)
            return false;
        if(sum == 0) return true;
        al.add(arr[i]);
        boolean leftPossible = partition(arr, sum - arr[i], i+1, al);
        if (leftPossible)
            return true;
        al.remove(al.size() - 1);
        return partition(arr, sum, i+1, al);
    }
}