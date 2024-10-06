import java.util.ArrayList;
import java.util.List;

class Solution {
    private int idx = 0; // To maintain the current index for preorder traversal

    // Helper method to search the current root in the inorder traversal
    public int search(int[] inorder, int start, int end, int curr) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == curr) {
                return i;
            }
        }
        return -1;
    }

    // Method to build the tree from preorder and inorder traversals
    public TreeNode build(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        
        // Take current root value from preorder and move the index forward
        int curr = preorder[idx++];
        TreeNode node = new TreeNode(curr);

        // If it's a leaf node, just return it
        if (start == end) {
            return node;
        }

        // Find the position of the current root in the inorder array
        int pos = search(inorder, start, end, curr);

        // Recursively build the left and right subtrees
        node.left = build(preorder, inorder, start, pos - 1);
        node.right = build(preorder, inorder, pos + 1, end);

        return node;
    }

    // Method to print the inorder traversal of the constructed tree
    public List<Integer> print(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    // Helper method for inorder traversal of the tree
    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, list); // Traverse left subtree
        list.add(node.val);                // Add current node value
        inorderTraversal(node.right, list);// Traverse right subtree
    }

    // Main method to build the tree and print its inorder traversal
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        TreeNode root = build(preorder, inorder, 0, n - 1);
        
        // Print the inorder traversal of the constructed tree
        List<Integer> inorderList = print(root);
        System.out.println(inorderList); // For debugging purposes
        return root; // Return the root of the constructed tree
    }
}
