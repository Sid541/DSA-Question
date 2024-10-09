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
    private int postIdx;

    public int search(int[] inorder, int start, int end, int curr) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == curr) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode build(int[] inorder, int[] postorder, int start, int end) {
        
        if (start > end) {
            return null;
        }

        
        int curr = postorder[postIdx];
        postIdx--; 

        TreeNode node = new TreeNode(curr);

       
        if (start == end) {
            return node;
        }

        int pos = search(inorder, start, end, curr);

        
        node.right = build(inorder, postorder, pos + 1, end);
        node.left = build(inorder, postorder, start, pos - 1); 

        return node;
    }

    public void print(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        print(root.left, list);
        list.add(root.val);
        print(root.right, list);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = postorder.length - 1; 
        return build(inorder, postorder, 0, postorder.length - 1);
    }
}
