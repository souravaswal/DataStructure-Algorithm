#Given an array check if sub-array with sum zero exists or not using BruteForce

public class ZeroSubArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int array[] = {10, 20, 5, 5, 10, 15};
        int n = array.length;
        boolean found = false;
        for (int i = 0; i < n; i++) 
        {
            int sum = 0;
            for (int j = i; j < n; j++) 
            {
                sum+=array[j];
                if(sum == 0)
                {
                    found =  true;
                    break;
                }
            }
            if(found) {break;}
        }
        System.out.println("Found: "+found);
    }

}