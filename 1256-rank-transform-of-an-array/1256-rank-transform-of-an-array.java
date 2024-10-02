class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        HashMap<Integer, Integer>map=new HashMap<>();
        int []ans=new int[n];
        int []nums=new int [n];

        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }

        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
               map.put(nums[i],count);
               count++;
            }
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                ans[i]=map.get(arr[i]);
            }
        }
        return ans;

    }
}