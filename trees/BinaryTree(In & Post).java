package trees; /**

Given inorder and postorder traversal of a tree, construct the binary tree.

    Note: You may assume that duplicates do not exist in the tree. 

Example :

Input : 
        Inorder : [2, 1, 3]
        Postorder : [2, 3, 1]

Return : 
            1
           / \
          2   3

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

public class Solution 
{
    HashMap<Integer, Integer> map = new HashMap<>();
    int index = 0;
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        for(int i=0; i<B.size()-1; i++)
        {
            map.put(A.get(i), i);
            int temp = B.get(B.size()-1-i);
            B.set(A.size()-1-i, B.get(i));
            B.set(i, temp);
        }
        return createTree(A, B, 0, A.size()-1);
    }

    public TreeNode createTree(ArrayList<Integer> A, ArrayList<Integer> B, int start, int end)
    {
        if(start > end)
        {
            return null;
        }
        
        TreeNode node =  new TreeNode(B.get(index++));
        
        if(start == end)
        {
            return node;
        }
        int position = map.get(node.val);
        
        
        node.right = createTree(A, B, position+1, end);
        node.left = createTree(A, B, start, position-1);
        return node;
    }
}
