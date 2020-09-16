public class LargestSubArray
{
    public static void main(String[] args) 
    {
        int array[] = {-1, 2, -1, 4, 5};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++)
        {
            for(int j=i; j<array.length; j++) 
            {
                int cursum = sum[j] - sum[i] + array[i];
                for(int k = i; k<=j; k++)
                {
                    cursum+=array[k];
                }
                if(cursum > max) 
                {
                    max = cursum;
                }
            }
        }
        System.out.println("maximum is : "+max);
    }
}