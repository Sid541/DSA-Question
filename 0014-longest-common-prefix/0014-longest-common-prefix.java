class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans;
            }
            ans = ans.concat(String.valueOf(first.charAt(i)));
        }
        return ans;
    }
}