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

// Another solution for the problem by traversing through the end of the string
public class Solution {
	public int lengthOfLastWord(final String a)
	{
		boolean char_flag = false;
		int len = 0;
		for (int i = a.length() - 1; i >= 0; i--) {
			if (Character.isLetter(a.charAt(i))) {
				// Once the first character from last
				// is encountered, set char_flag to true.
				char_flag = true;
				len++;
			}
			else {
				// When the first space after the characters
				// (from the last) is encountered, return the
				// length of the last word
				if (char_flag == true)
					return len;
			}
		}
		return len;
	}
}

