class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Using sliding window
        int start=0;
        int end=0;
        int max=0;
        List<Character>list=new ArrayList<>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max=Math.max(max,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    }
}