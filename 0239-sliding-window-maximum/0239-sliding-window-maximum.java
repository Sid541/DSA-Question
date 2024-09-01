class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>dq=new ArrayDeque<>();
        int n=nums.length;
        int []res=new int[n-k+1];
        int idx=0;
        while(idx<k){
        while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[idx]){
            dq.pollLast();
        }
        dq.offerLast(idx);
        idx++;
        }
        res[0]=nums[dq.peekFirst()];

        for(int i=0;i<n-k+1;i++){
            if(!dq.isEmpty() && dq.peekFirst()<= (i-1)){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i+k-1]){
            dq.pollLast();
        }
        dq.offerLast(i+k-1);
        res[i]=nums[dq.peekFirst()];
        }
        return res;
    }
}
