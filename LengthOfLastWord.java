/**
Find length of last word in the given string...
**/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        String[] array = A.split(" ");
        if(array.length == 0) return 0;
        return array[array.length-1].length();
    }
}
