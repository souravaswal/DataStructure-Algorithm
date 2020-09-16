#Print all the string permutations that are unique

import java.util.HashSet;
import java.util.Set;

public class RecursionProgram 
{
    public static void main(String args[])
    {
        permutations("abcd", 0, 3);
    }
    
    static Set<String> set = new HashSet<String>();
    static void permutations(String s, int l, int r)
    {
        if(l == r)
        {
            if(set.contains(s)) return;
            set.add(s);
            System.out.println(s);
            return;
        }
        for (int i = l; i <= r; i++) 
        {
            s = interchangeChar(s, l, i);
            permutations(s, l+1, r);
            s = interchangeChar(s, l, i);
        }
        
    }

    private static String interchangeChar(String s, int a, int b) {
        // TODO Auto-generated method stub
        char[] array = s.toCharArray();
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return String.valueOf(array);
    }
}