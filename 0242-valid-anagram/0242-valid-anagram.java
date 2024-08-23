class Solution {
    public boolean isAnagram(String s, String t) {
       

        HashMap<Character, Integer> count = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(char c: s.toCharArray()){
            if(count.containsKey(c)){
                count.put(c,count.get(c)+1);
            }
            else{
                count.put(c,1);
            }
        }

        for(char c: t.toCharArray()){
            if(count.containsKey(c)){
                count.put(c,count.get(c)-1);
            }
            else{
                count.put(c,0);
            }
        }
        for(int val : count.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
        
    }
}
/* if(s.length()!=t.length()){
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
        return true;*/