/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode newList = new ListNode(0);
        ListNode dummy = newList;
        while(true)
        {
            if(A == null)
            {
                dummy.next = B;
                break;
            }
            if(B == null)
            {
                dummy.next = A;
                break;
            }
            
            if(A.val > B.val)
            {
                dummy.next = B;
                B = B.next;
            }
            else
            {
                dummy.next = A;
                A = A.next;
            }
            dummy = dummy.next;
        }
        
        return newList.next;
    }
}
