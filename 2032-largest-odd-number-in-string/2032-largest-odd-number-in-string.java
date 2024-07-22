class Solution {
    public String largestOddNumber(String num) {
        String largestOdd="";
        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i)) && (num.charAt(i) - '0') % 2 != 0) {
                String currentOdd = num.substring(0, i + 1);
                
                if (largestOdd.equals("") ||  currentOdd.compareTo(largestOdd) > 0) {
                    largestOdd = currentOdd;
                }
            }
        }
        if(!largestOdd.equals("")){
            return largestOdd;
        }
        
        return "";
    }
}