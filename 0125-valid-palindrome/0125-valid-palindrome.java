class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        String str=s1.replaceAll("[^a-zA-Z0-9]","");
        int i=0;
        int j=str.length()-1;
        if(s1==" "){
            return true;
        }
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}