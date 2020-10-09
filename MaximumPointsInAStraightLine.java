/**

Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.

Sample Input :

(1, 1)
(2, 2)

Sample Output :

2

You will be given 2 arrays X and Y. Each point is represented by (X[i], Y[i])

**/

public class Solution 
{
    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) 
    {
        int length1 = a.size();
        int length2 = b.size();
        int maximum = 0;
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        
        if(length1 != length2 || length1 == 0 || a == null || length2 == 0 || b == null)
        {
            return maximum;
        }
        
        if(length1 == 1 && length2 == 1) return 1;
        
        
        for(int i=0; i<length1; i++)
        {
            int vertical = 0;
            int duplicate  = 1;
            int xi = a.get(i);
            int yi = b.get(i);
            for(int j=i+1; j<length2; j++)
            {
                int xj = a.get(j);
                int yj = b.get(j);
                if(xi == xj)
                {
                    if(yi == yj)
                    {
                        duplicate++;
                    }
                    else
                    {
                        vertical++;
                    }
                    
                }
                else
                {
                    double slope = 0.0;
                    if(yj - yi == 0)
                        slope = 0.0;
                    else
                    {
                        slope = (double)(yj - yi)/(double)(xj - xi);
                        
                    }
                    
                    if(!map.containsKey(slope))
                    {
                        map.put(slope, 1);
                    }
                    else
                    {
                        map.put(slope, map.get(slope)+1);
                    }    
                    
                }
                
            }
                for(int value : map.values())
                {
                    if(value + duplicate > maximum)
                    {
                        maximum = value + duplicate;
                    }
                    
                }
                maximum = Math.max(vertical + duplicate, maximum);
                map.clear();
        }
        return maximum;
    }
}


