#Kaden's Algorithm

#Checks if sum of a sub-array is positive or not? if positive, then Ok otherwise wait for next iterations if they are making it positive again or not.

public class LargestSubArray
{
    public static void main(String[] args) 
    {
        int array[] = {-1, 2, -1, 4, 5};
        int max = Integer.MIN_VALUE;
        int current_max = 0;
        for (int i = 0; i < array.length; i++) 
        {
            current_max = current_max + array[i];
            if(current_max > max)
            {
                max = current_max;
            }
            if(current_max < 0)
            {
                current_max = 0;
            }
        }
        System.out.println("maximum is : "+ max);
    }
}
