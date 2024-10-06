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
    public int idx=0; 
    public int search(int []inorder, int start, int end, int curr){
        for(int i=start;i<=end;i++){
            if(inorder[i]==curr){
                return i;
            }
        }
        return -1;
    }
    public TreeNode build(int[] preorder, int[] inorder, int start, int end){
        
        if(start>end){
            return null;
        }
        int curr=preorder[idx];
        idx++;
        TreeNode node=new TreeNode(curr);
        if(start==end){
            return node;
        }
        int pos=search(inorder, start, end, curr);
        node.left = build(preorder, inorder, start, pos-1);
        node.right = build(preorder, inorder, pos + 1, end);
        return node;
    }
    public List<Integer> print(TreeNode root){
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null){
          return list;
        }
        else{
            print(root.left);
            list.add(root.val);
            print(root.right);
        }
        return list;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    int n=inorder.length;
       TreeNode root = build(preorder, inorder, 0, n-1);
       List<Integer> inorderList = print(root);
        return root;
    }
}