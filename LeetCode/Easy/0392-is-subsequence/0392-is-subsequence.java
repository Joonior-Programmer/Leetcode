class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        char[] sChar = s.toCharArray();
        for (char v : t.toCharArray()){
            if (j < s.length() && sChar[j] == v) ++j;
        }
        if (j == s.length()) return true;
        return false;
    }
}