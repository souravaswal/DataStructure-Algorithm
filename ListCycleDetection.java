# Detect cycle in a LinkedList & return the Node

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        Set<ListNode> set = new HashSet<ListNode>();
        if(a.next == null || a == null)
        {
            return null;
        }
        while(a.next != null)
        {
            if(set.contains(a)){
                return a;
            }
            set.add(a);
            a = a.next;
        }
        return null;
    }
}
