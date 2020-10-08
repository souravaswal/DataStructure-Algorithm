/**

Given a binary tree and a sum, find all root-to-leaf paths where each path’s sum equals the given sum.

For example:
Given the below binary tree and sum = 22,

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1

return

[
   [5,4,11,2],
   [5,8,4,5]
]

**/

public class Solution 
{
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) 
    {
        ArrayList<ArrayList<Integer>> parentList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> childList = new ArrayList<Integer>();
        if(A == null)
        {
            return null;
        }
        pathSum(A, B, parentList, childList);
        return parentList;
    }
    
    public void pathSum(TreeNode node, int sum, ArrayList<ArrayList<Integer>> parentList, ArrayList<Integer> childList)
    {
        if(node == null)
        {
            return;
        }
        int current = node.val;
        childList.add(current);
        if(node.left == null && node.right == null)
        {
            if(sum - current == 0)
            {
                parentList.add(new ArrayList<Integer>(childList));
            }
            
        }
        pathSum(node.left, sum-current, parentList, childList);
        pathSum(node.right, sum-current, parentList, childList);
        childList.remove(childList.size()-1);
    }
}
