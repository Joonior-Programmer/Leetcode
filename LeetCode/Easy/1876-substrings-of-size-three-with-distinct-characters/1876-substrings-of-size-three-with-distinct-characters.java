class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        
        int[] count = new int[26];
        int dup = 0;
        int ret = 0;
        char[] sCharArray = s.toCharArray();
        ++count[sCharArray[0]-97];
        
        for (int i = 1; i < 3; ++i)
            if (count[sCharArray[i] - 97]++ > 0) ++dup;
        
        if (dup == 0) ++ret;
        
        for (int i = 3; i < s.length(); ++i){
            if (count[sCharArray[i-3]-97]-- > 1) dup--;
            if (count[sCharArray[i]-97]++ > 0) ++dup;
            if (dup == 0) ++ret;
        }
        return ret;
    }
}