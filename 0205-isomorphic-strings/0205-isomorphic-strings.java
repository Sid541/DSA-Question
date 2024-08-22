class Solution {
    public boolean isIsomorphic(String s, String t) {
        int []map1=new int [128];
        int []map2=new int [128];

        Arrays.fill(map1,-1);
        Arrays.fill(map2,-1);

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
          char s1=s.charAt(i);
          char t1=t.charAt(i);

        if(map1[s1]==-1){
           map1[s1]=t1;
        }
        if(map2[t1]==-1){
           map2[t1]=s1;
        }
        if(map1[s1]!=t1 || map2[t1]!=s1){
            return false;
        }
        }
        return true;
    }

}