#Calculate sum upto each index in index of a different array & then calculate the sum upto any index by formula:
#current_sum = sum[j] - sum[i] + array[i];

public class LargestSubArray
{
    public static void main(String[] args) 
    {
        int array[] = {-1, 2, -1, 4, 5};
        int max = Integer.MIN_VALUE;
        int sum[] = new int[array.length];
        sum[0] = array[0];
        for (int i = 1; i < sum.length; i++) 
        {
            sum[i] = sum[i-1] + array[i];
        }
        for(int i = 0; i < array.length; i++)
        {
            for(int j=i; j<array.length; j++) 
            {
                int cursum = sum[j] - sum[i] + array[i];
                if(cursum > max) 
                {
                    max = cursum;
                }
            }
        }
        System.out.println("maximum is : "+max);
    }
}