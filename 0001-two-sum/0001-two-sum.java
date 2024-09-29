class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            int compl=target-nums[i];
            if(map.containsKey(compl))
            return new int[]{map.get(compl),i};
            map.put(nums[i],i);
        }
         return new int[]{};
    }
}