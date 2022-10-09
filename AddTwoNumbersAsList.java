/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
 
 /**
 
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

    342 + 465 = 807

Make sure there are no trailing zeros in the output list
So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807

 **/
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode node = new ListNode(0);
        ListNode current = node;
        int sum, carry = 0;
        while(A != null || B != null) {
            sum = carry;
            if(A != null)
            {
                sum+= A.val;
                A = A.next;
            }
            
            if(B != null)
            {
                sum+= B.val;
                B = B.next;
            }
            
            current.next = new ListNode(sum%10);
            carry = sum / 10;
            current = current.next;
            sum = sum / 10;
        }
        if(carry > 0)
        {
            current.next = new ListNode(carry);
        }
        return node.next;
    }
}
