class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int j = 0;
        char[] sChar = s.toCharArray();
        for (char v : t.toCharArray()){
            if (sChar[j] == v) {
                ++j;
                if (j == sChar.length) return true;
            }
        }
        if (j == s.length()) return true;
        return false;
    }
}