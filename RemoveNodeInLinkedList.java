/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
 
 /**
 
Given a linked list, remove the nth node from the end of list and return its head.

For example,
Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.

    Note:

        If n is greater than the size of the list, remove the first node of the list.

Try doing it using constant additional space.

 **/
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int count = 1;
        ListNode temp = A;
        while(temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        int length = count - B;
        if(length <= 0)
        {
            return A.next;
        }
        ListNode current = A;
        int j = 1;
        while(j < length)
        {
            j++;
            current = current.next;
        }
        current.next = current.next.next;
        
        return A;
    }
}
