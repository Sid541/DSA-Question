/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean sum(TreeNode root, int targetSum, int currSum){
        if(root==null)
        return false;
        currSum=currSum+root.val;
        if(root.left==null && root.right==null){
           if(currSum==targetSum){
            return true;
        }
        }
        return sum(root.left, targetSum, currSum) || sum(root.right, targetSum, currSum);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return sum(root, targetSum, 0);


        
    }
}