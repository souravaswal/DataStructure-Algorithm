/**

Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.

Notes:

    Expected solution is linear in time and constant in space.

For example,

List 1-->2-->1 is a palindrome.
List 1-->2-->3 is not a palindrome.

**/

public class Solution {
    public int lPalin(ListNode A) {
        List<Integer> list = new ArrayList<>();
        if(A.next == null)
        {
            return 1;
        }
        while(A != null)
        {
            list.add(A.val);
            A = A.next;
        }
        for(int i=0; i<(list.size()/2); i++)
        {
            if(! list.get(i).equals(list.get(list.size()-i-1))){
                return 0;
            }
        }
        return 1;
    }
}

