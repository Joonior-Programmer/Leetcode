class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        char[] sCharArray = s.toCharArray();
        int retL = 0;
        int retR = 0;
        
        for (int i = 0; i < n; ++i){
            int l = i;
            int r = i;
            
            while (l > -1 && r < n && sCharArray[l] == sCharArray[r]){
                if (retR - retL < r - l){
                    retR = r;
                    retL = l;
                }
                ++r;
                l--;
            }
            
            l = i;
            r = i + 1;
            
            while (l > -1 && r < n && sCharArray[l] == sCharArray[r]){
                if (retR - retL < r - l){
                    retR = r;
                    retL = l;
                }
                ++r;
                l--;
            }
        }
        
        return s.substring(retL, retR+1);
    }
}