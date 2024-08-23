class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!map.isEmpty()){
            int max=0;
            char maxChar='a';
            for(Map.Entry<Character, Integer> mp : map.entrySet()){
                if(mp.getValue()>max){
                    max=mp.getValue();
                    maxChar=mp.getKey();
                }
            }
            for(int i=0;i<max;i++){
                ans.append(maxChar);
            }
            map.remove(maxChar);
        }
        return ans.toString();
    }
}