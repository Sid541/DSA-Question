class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findPaths(root, targetSum, 0, list, ans);
        return ans;
    }

    private void findPaths(TreeNode node, int targetSum, int currSum, List<Integer> list, List<List<Integer>> ans) {
        if (node == null) {
            return;
        }
        currSum += node.val;
        list.add(node.val);
        if (node.left == null && node.right == null && currSum == targetSum) {
            ans.add(new ArrayList<>(list)); 
        }

        findPaths(node.left, targetSum, currSum, list, ans);
        findPaths(node.right, targetSum, currSum, list, ans);

        list.remove(list.size() - 1);
    }
}
