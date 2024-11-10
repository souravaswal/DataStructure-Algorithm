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
 Given a binary tree, return the postorder traversal of its nodes’ values

Example :

Given binary tree

   1
    \
     2
    /
   3

return [3,2,1].

Using recursion is not allowed
 **/
public class Solution {
    public int[] postorderTraversal(TreeNode A) {
        Stack<TreeNode> stackIn = new Stack<>();
        stackIn.push(A);
        Stack<TreeNode> stackOut = new Stack<>();
        while(!stackIn.isEmpty())
        {
            TreeNode current = stackIn.pop();
            stackOut.push(current);
            
            if(current.left != null)
            {
                stackIn.push(current.left);
            }
            
            if(current.right != null)
            {
                stackIn.push(current.right);
            }
        }
        
        int array[] = new int[stackOut.size()];
        int i = 0;
        while(stackOut.isEmpty())
        {
            array[i] = stackOut.pop().val;
            i++;
        }
        // for(int i=0; i<stackOut.size(); i++)
        // {
        //     //System.out.print(stackOut.peek() +" ");
        //     array[i] = stackOut.pop().val;
        // }
        return array;
    }
}
