/**
Find sub-string in a string without using any Library Method of String
**/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        if (A == null || B ==null || A.isEmpty() || B.isEmpty())
        {
            return -1;
        }
        if(A.length() < B.length()){
            return -1;
        }
        if(A.length() == B.length()){
            if(A.equals(B)){
                return 0;
            }
            else return -1;
        }
        for(int i =0; i<A.length()-B.length(); i++)
        {
            int count = 0;
            for(int j=0; j<B.length(); j++)
            {
                if(A.charAt(i+j)==B.charAt(j)){
                    count++;
                }
            }
            if(count==B.length()){
                return i;
            }
        }
        return -1;
    }
}


