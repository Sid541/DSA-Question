class Solution
{
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        boolean vis[] = new boolean[graph.length];
        dfs(graph,0,graph.length-1,new ArrayList<>(),ans,vis);
        return ans;
    }
    
    void dfs(int [][]graph, int curr, int target,List<Integer> l, List<List<Integer>> ans, boolean []vis)
    {
        if(curr==target)
        {
            l.add(target);
            ans.add(new ArrayList<>(l));
        }
        else
        {    
            l.add(curr);
            vis[curr] = true;
            for(int i : graph[curr])
            {
                if(vis[i]==false)
                    dfs(graph,i,target,l,ans,vis);
            }
        }
        
        vis[curr] = false;
        l.remove(l.size()-1);
    }
}