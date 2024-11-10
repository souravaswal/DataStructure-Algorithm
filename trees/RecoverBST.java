package trees; /**

Two elements of a binary search tree (BST) are swapped by mistake.
Tell us the 2 values swapping which the tree will be restored.

    Note:
    A solution using O(n) space is pretty straight forward. Could you devise a constant space solution? 

Example :


Input : 
         1
        / \
       2   3

Output : 
       [1, 2]

Explanation : Swapping 1 and 2 will change the BST to be 
         2
        / \
       1   3
which is a valid BST          

**/

/**
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
public class Solution {
    public int[] recoverTree(TreeNode A) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        TreeNode current = A;
        
        while(current != null || !stack.isEmpty())
        {
            while(current != null)
            {
                stack.push(current);
                current = current.left;
            }
        
        current = stack.pop();
        list.add(current.val);
        current = current.right;
    
        }
        
        int[] array = new int[list.size()];
        int[] array2 = new int[2];
        int count = 0;
        for(int i=0; i<=list.size()-1; i++) 
        {
            array[i] = list.get(i);
        }
        Arrays.sort(array);
        for(int i=0; i<=list.size()-1; i++) 
        {
            if(list.get(i) != array[i])
            {
                array2[count] = array[i];
                count++;
            }
        }
        return array2;
    }
}
