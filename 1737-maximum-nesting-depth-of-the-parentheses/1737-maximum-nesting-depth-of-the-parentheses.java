class Solution {
    public int maxDepth(String s) {
        int max=0;
        int curr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                curr++;
                max=Math.max(curr,max);
            }
            else if(s.charAt(i)==')'){
                curr--;
            }
        }
        return max;

    }
}