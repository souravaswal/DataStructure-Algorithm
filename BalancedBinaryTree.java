/**

Given a binary tree, determine if it is height-balanced.

    Height-balanced binary tree : is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1. 

Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Example :

Input : 
          1
         / \
        2   3

Return : True or 1 

Input 2 : 
         3
        /
       2
      /
     1

Return : False or 0 
         Because for the root node, left subtree has depth 2 and right subtree has depth 0. 
         Difference = 2 > 1. 

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
    public int isBalanced(TreeNode A) {
        int leftHeight = 0;
        int rightHeight = 0;
        if(A == null)
        {
            return 1;
        }
        
        // Here, I am checking heights of left & right sub-tree
        leftHeight = height(A.left);
        rightHeight = height(A.right);
        
        
        /** Checking if the height difference at any point is always less than 1 & 
        left & right sub-trees are balanced or not.
        **/
        
        if(Math.abs(leftHeight-rightHeight) <=1 && isBalanced(A.left)==1
        && isBalanced(A.right)==1)
        {
            return 1;
        }
        return 0;
        
    }
    
    /**
    This utility method will return height from the provided Node Or Maximum 
    distance to the leaf node from the provided Node
    **/
    public int height(TreeNode Node)
    {
        if(Node == null)
        {
            return 0;
        }
        
        return 1 + Math.max(height(Node.left), height(Node.right));
    }
}

