class Solution {
    List<List<Integer>>res=new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(0,nums,new ArrayList<>());
        return res;
    }

    public void findSubsets(int idx, int[] nums,List<Integer>list){
        if(idx==nums.length){
            res.add(new ArrayList<>(list));
        }
        else{
            list.add(nums[idx]);
            findSubsets(idx+1,nums,list);

            list.remove(list.size()-1);
            findSubsets(idx+1,nums,list);
        }
    }
}