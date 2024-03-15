class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        int i = 0;
        
        while (i < n){
            char temp = s.charAt(i++);
            if (temp == ' ') {
                k--;
                if (k == 0) {
                    i--;
                    break;
                }
            }
        }
        
        return s.substring(0, i);
    }
}