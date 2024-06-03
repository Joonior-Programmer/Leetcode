class Solution {
    public int appendCharacters(String s, String t) {
        int n = s.length();
        int m = t.length();
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        int j = 0;
        
        for (int i = 0; i < n; ++i){
            if (j == m) break;
            if (sCharArray[i] == tCharArray[j]) ++j;
        }
        
        return m - j;
    }
}