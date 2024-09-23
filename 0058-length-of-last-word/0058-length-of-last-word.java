class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int n=str.length();
        int count=0;
        int i=n-1;
        while(i>=0){
            if (Character.isWhitespace(str.charAt(i))){
                break;
            }
            else{
                count++;
            }
            i--;
            
        }
        return count;
    }
}