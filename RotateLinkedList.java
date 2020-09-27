/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
 
 /**

Given a list, rotate the list to the right by k places, where k is non-negative.

For example:

Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.

 **/
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        ListNode current = A;
        int count = 1;
        if(current.next == null)
        {
            return current;
        }
        while(current.next != null)
        {
            current = current.next;
            count++;
        }
        current.next = A;
        int length = count - B%count -1;
        ListNode traverse = A;
        while(length > 0)
        {
            traverse = traverse.next;
            length--;
        }
        A = traverse.next;
        traverse.next = null;
        return A;
    }
}
