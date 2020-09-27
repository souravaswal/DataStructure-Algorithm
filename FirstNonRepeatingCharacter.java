/**
Given a string A denoting a stream of lowercase alphabets. You have to make new string B.

B is formed such that we have to find first non-repeating character each time a character is inserted to the stream and append it at the end to B. If no non-repeating character is found then append '#' at the end of B

INPUT : "abadbc"

OUTPUT: "aabbdd"
**/

public class Solution {
    public String solve(String A) {
        int[] frequency = new int[26];
        Queue<Character> queue = new LinkedList<Character>();
        int i = 0;
        StringBuffer answer = new StringBuffer("");
        while(i < A.length())
        {
            queue.add(A.charAt(i));
            frequency[A.charAt(i) - 97]++;
            while(!queue.isEmpty())
            {
                if(frequency[queue.peek() - 97] > 1)
                {
                    queue.poll();
                }
                else
                {
                    answer.append(queue.peek());
                    break;
                }
            }
            if(queue.isEmpty())
            {
                answer.append('#');
            }
            i++;
        }
        return answer.toString();
    }
}
