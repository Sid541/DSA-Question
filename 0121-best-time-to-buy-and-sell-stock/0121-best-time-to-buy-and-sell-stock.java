class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;
        int n=prices.length;
        int j=0;
        for(int i=0;i<n;i++){
            min=Math.min(min,prices[i]);
            profit=prices[i]-min;
            maxProfit=Math.max(maxProfit,profit);
        }
       return maxProfit;
       
    }
}