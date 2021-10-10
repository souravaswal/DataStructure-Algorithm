/**

Given a string A consisting only of lowercase characters, we need to check whether it is possible to make this string a palindrome after removing exactly one character from this.

If it is possible then return 1 else return 0.



Problem Constraints

3 <= |A| <= 105

A[i] is always a lowercase character.



Input Format

First and only argument is an string A.


Output Format

Return 1 if it is possible to convert A to palindrome by removing exactly one character else return 0.


Example Input

Input 1:

 A = "abcba"

Input 2:

 A = "abecbea"



Example Output

Output 1:

 1

Output 2:

 0



Example Explanation

Explanation 1:

 We can remove character ‘c’ to make string palindrome

Explanation 2:

 It is not possible to make this string palindrome just by removing one character 


**/

public class Solution 
{
    public int solve(String A) 
    {
        int low = 0, high = A.length()-1;
        while(low < high)
        {
            if(A.charAt(low) != A.charAt(high))
            {
                if(isPalindrome(A, low+1, high))
                {
                    return 1;
                }
                
                if(isPalindrome(A, low, high-1))
                {
                    return 1;
                }
                return 0;
            }
            else
            {
                low++;
                high--;
            }
        }
        return 1;
    }
    
    
    /**
    This method will check if the given substring provided is Palindrome or not..
    **/
    public boolean isPalindrome(String s, int low, int high)
    {
        while(low < high)
        {
            if(s.charAt(low) != s.charAt(high))
            {
                return false;
            }
            else
            {
                low++;
                high--;
            }
        }
        return true;
    }
}


