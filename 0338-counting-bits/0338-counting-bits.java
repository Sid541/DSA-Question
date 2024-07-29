class Solution {
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=countbit(i);
        }
        return ans;
    }
    public static int countbit(int x){
        int count=0;
        while(x>0){
            if((x%2)==1)
            count++;
            x=x/2;
        }
        return count;
    }
}