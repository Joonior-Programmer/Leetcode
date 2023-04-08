class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char[] newS = new char[s.length() * 2 - 2];
        int j = 0;
        for (int i = 1; i < s.length(); ++i) newS[j++] = s.charAt(i);
        for (int i = 0; i < s.length() - 1; ++i) newS[j++] = s.charAt(i);

        return new String(newS).contains(s);
    }
}