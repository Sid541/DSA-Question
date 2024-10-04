class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        long sumAns=0;
        int targetSum=0;
        targetSum=skill[0]+skill[n-1];
        int currSum=0;
        for(int i=0;i<n/2;i++){
           currSum=skill[i]+skill[n-i-1];
           if(currSum!=targetSum){
            return -1;
           }
           sumAns=sumAns+ (long)skill[i]*skill[n-i-1];
        }

        return sumAns;
    }
}