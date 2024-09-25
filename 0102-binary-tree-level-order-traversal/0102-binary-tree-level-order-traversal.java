class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        
        if(root==null){
            return finalAns;
        }
        q.add(root);
        while(!q.isEmpty()){
         int size=q.size();
         List<Integer>list=new ArrayList<>();
         for(int i=0;i<size;i++){
            if(q.peek().left!=null){
                q.add(q.peek().left);
            }
            if(q.peek().right!=null){
                q.add(q.peek().right);
            }
            list.add(q.remove().val);
            
         }
         finalAns.add(list);
        }
        return finalAns;
        
    }
}

/*class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        
        if(root==null){
            return finalAns;
        }
        q.add(root);
        while(!q.isEmpty()){
         int size=q.size();
         List<Integer>list=new ArrayList<>();
         TreeNode curr=q.peek();
         for(int i=0;i<size;i++){
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            list.add(q.remove().val);
            
         }
         finalAns.add(list);
        }
        return finalAns;
        
    }
}*/