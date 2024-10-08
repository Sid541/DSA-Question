class Solution {
    public int minLength(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && ((st.peek()=='A' && s.charAt(i)=='B') || (st.peek()=='C' && s.charAt(i)=='D'))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        int count=0;
        while(!st.isEmpty()){
            st.pop();
            count++;
        }
        return count;
    }
}