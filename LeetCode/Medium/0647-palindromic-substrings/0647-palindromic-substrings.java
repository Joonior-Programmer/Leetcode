class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ret = n;
        char[] sCharArray = s.toCharArray();
        
        for (int i = 0; i < n; ++i){
            int l = i-1;
            int r = i+1;
            
            while (l > -1 && r < n){
                if (sCharArray[l] == sCharArray[r]) ++ret;
                else break;
                l--;
                ++r;
            }
            
            l = i;
            r = i+1;
            
            while (l > -1 && r < n){
                if (sCharArray[l] == sCharArray[r]) ++ret;
                else break;
                l--;
                ++r;
            }
        }
        
        return ret;
    }
}