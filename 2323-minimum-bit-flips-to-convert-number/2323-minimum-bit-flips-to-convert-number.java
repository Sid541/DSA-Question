class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=0;
        ans=start^goal;
        int count=0;
        while(ans>0){
            if((ans%2)==1){
                count++;
            }
            ans=ans/2;
        }
        return count;
    }
}