// Maximize the sum of the coins for the player.

public class GameTheory
{
    public static void main(String args[])
    {
        int[] array = {1, 5, 7, 3, 2, 4};
        int answer = maxCoin(array, 0, array.length-1);
        System.out.println(answer);
    }
    
    static int maxCoin(int a[], int l, int r)
    {
        if(l+1 == r)
        {
            return Math.max(a[l], a[r]);
        }
        
        return Math.max(a[l] + Math.min(maxCoin(a, l+1, r-1), maxCoin(a, l+2, r)), 
                        a[r] + Math.min(maxCoin(a, l+1, r-1), maxCoin(a, l, r-2)));
    }
}