class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        int i=0;
       while(i<n){
        if(chalk[i]>k){
            return i;
        }
        k=k-chalk[i];
        if(i==n-1){
            i=0;
            continue;
        }
        i++;
       }
        return 0;
    }
}