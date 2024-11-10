package trees; /**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
 
 /**
	

Given a binary tree, return the preorder traversal of its nodes’ values.

Example :
Given binary tree

   1
    \
     2
    /
   3

return [1,2,3].

Using recursion is not allowed.

 **/
public class Solution {
    public int[] preorderTraversal(TreeNode A) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        TreeNode current = A;
        
        while(current != null || !stack.isEmpty())
        {
            while(current != null)
            {
                list.add(current.val);
                stack.push(current);
                current = current.left;
            }
        current = stack.pop();
        current = current.right;
    
        }
        
        int[] array = new int[list.size()];
        for(int i=0;i<array.length;i++) 
        {
            array[i] = list.get(i);
        }
        return array;
        
    }
}
