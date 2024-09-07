class Solution {
    public boolean canJump(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i<=max){
                max=Math.max(max,(i+nums[i]));
            }
            else if(i>max){
               return false;
            }
        }
        return true;
    }
}