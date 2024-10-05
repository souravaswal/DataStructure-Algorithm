import java.util.Stack;

/**

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem

**/

public class GenerateAllParenthesis {
    public int isValid(String A) {
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while(i < A.length())
        {
            if(A.charAt(i)=='(' || A.charAt(i)=='[' || A.charAt(i)=='{')
            {
                stack.push(A.charAt(i));
            }
            else
            {
                if(stack.isEmpty())
                {
                    return 0;
                }
                if(A.charAt(i) == ')')
                {
                    if(stack.peek() != '(')
                    {
                        return 0;
                    }
                    else
                    {
                        stack.pop();
                    }
                }
                else if(A.charAt(i) == ']')
                {
                    if(stack.peek() != '[')
                    {
                        return 0;
                    }
                    else
                    {
                        stack.pop();
                    }
                }
                else 
                {
                    if(stack.peek() != '{')
                    {
                        return 0;
                    }
                    else
                    {
                        stack.pop();
                    }
                }
            }
            i++;
        }
        return 1;
    }
}
