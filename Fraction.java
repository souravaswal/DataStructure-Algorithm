/**


Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

Example :

Given numerator = 1, denominator = 2, return "0.5"
Given numerator = 2, denominator = 1, return "2"
Given numerator = 2, denominator = 3, return "0.(6)"


**/

public class Solution 
{
    public String fractionToDecimal(int A, int B) 
    {
        StringBuilder answer = new StringBuilder();
        if((A<0 && B>0) || (A>0 && B<0))
        {
            answer.append("-");
        }
        long numerator = A;
        long denominator = B;
        
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        
        long result = numerator/denominator;

        answer.append(String.valueOf(result));
        
        long remainder = numerator%denominator * 10;
        
        if(remainder == 0) return answer.toString();
        
        answer.append(".");
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        while(remainder != 0)
        {
            if(map.containsKey(remainder))
            {
                int beg = map.get(remainder);
                String part1 = answer.substring(0, beg);
                String part2 = answer.substring(beg, answer.length());
                return part1 + "(" + part2 + ")";
            }
            map.put(remainder, answer.length());
            result = remainder/denominator;
            answer.append(String.valueOf(result));
            remainder = (remainder%denominator) * 10;
        }
        return answer.toString();
    }
}

