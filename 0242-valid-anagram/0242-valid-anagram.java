class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            int flag=0;
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    flag=1;
                    t=t.substring(0,j)+ t.substring(j+1);
                    break;
                }
        }
        if(flag==0){
            return false;
        }
            }
        return true;
        
    }
}