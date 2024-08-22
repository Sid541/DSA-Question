class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<s.length();i++){
           if(st.isEmpty()){
              st.push(s.charAt(i));
           }
           else if(!st.isEmpty() && s.charAt(i)=='('){
            ans.append(s.charAt(i));
            st.push(s.charAt(i));
           }
           else{
            st.pop();
            if(!st.isEmpty()){
                 ans.append(s.charAt(i));
            }
            
           }
        }
           return ans.toString();
    }
}