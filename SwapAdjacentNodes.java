/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
 
 // Take a Linked List & swap adjacent nodes of the linkedList
public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode temp = new ListNode(0);
        temp.next = A;
        ListNode currentNode = temp;
        while(currentNode.next != null && currentNode.next.next != null)
        {
            ListNode firstNode = currentNode.next;
            ListNode secondNode = currentNode.next.next;
            firstNode.next = secondNode.next;
            currentNode.next = secondNode;
            currentNode.next.next = firstNode;
            currentNode = currentNode.next.next;
        }
        return temp.next;
    }
}
