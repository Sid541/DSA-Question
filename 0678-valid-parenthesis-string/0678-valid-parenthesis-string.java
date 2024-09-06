class Solution {
    public boolean checkValidString(String s) {
        int oc=0; int sc=0; int cc=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                oc++;
            }
            else if(c==')'){
                if(oc>0){
                    oc--;
                }
                else if(sc>0){
                    sc--;
                }
                else{
                    return false;
                }
            }
            else if(c=='*'){
                sc++;
            }
        }
        sc = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')') {
                cc++;
            } else if (c == '(') {
                if (cc > 0) cc--;
                else if (sc > 0) sc--;
                else return false;
            } else sc++;
        }
        

        return true;
    }
}