class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        for (int i = 0; i < charS.length; ++i){
            ++a[charS[i] - 'a'];
            ++b[charT[i] - 'a'];
        }
        for(int i = 0; i < 26; ++i){
            if (a[i] != b[i]) return false;
        }
        
        return true;
        
    }
}