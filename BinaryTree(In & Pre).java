/**

Given preorder and inorder traversal of a tree, construct the binary tree.

    Note: You may assume that duplicates do not exist in the tree. 

Example :

Input :
        Preorder : [1, 2, 3]
        Inorder  : [2, 1, 3]

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
    int index = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) 
    {
        for(int i=0; i<A.size(); i++)
        {
            map.put(B.get(i), i);
        }
        return makeTree(A, B, 0, A.size()-1);
    }
    
    public TreeNode makeTree(ArrayList<Integer> A, ArrayList<Integer> B, int start, int end)
    {
        if(start > end)
        {
            return null;
        }
        
        TreeNode node = new TreeNode(A.get(index++));
        
        if(start == end)
        {
            return node;
        }
        
        int position = map.get(node.val);
        
        node.left = makeTree(A ,B, start, position-1);
        node.right = makeTree(A, B, position+1, end);
        return node;
    }
}
