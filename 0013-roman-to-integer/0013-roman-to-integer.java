class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = 0;
        
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            char d=s.charAt(i+1);
            int v=m.get(c);
            int r=m.get(d);
            if(v<r){
                ans=ans-v;
            }
            else{
                ans=ans+v;
            }

        }
        char a=s.charAt(s.length()-1);
        int res=m.get(a);
        ans=ans+res;
        
        return ans;
    }
}