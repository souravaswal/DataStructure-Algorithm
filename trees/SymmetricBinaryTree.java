package trees; /**

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

Example :

    1
   / \
  2   2
 / \ / \
3  4 4  3

The above binary tree is symmetric.
But the following is not:

    1
   / \
  2   2
   \   \
   3    3

Return 0 / 1 ( 0 for false, 1 for true ) for this problem

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
    public int isSymmetric(TreeNode A) {
        if(A == null) {
            return 1;
        }
        if((A.left == null && A.right != null) || (A.right == null && A.left != null)) {
            return 0;
        }
        return checkSymmetric(A.left, A.right) ? 1 : 0;
    }
    
    public boolean checkSymmetric(TreeNode A, TreeNode B) {
        if(A == null && B == null) {
            return true;
        }
        if(A == null || B == null) {
            return false;
        }
        return A.val == B.val && checkSymmetric(A.left, B.right) && checkSymmetric(A.right, B.left);
    }
}

