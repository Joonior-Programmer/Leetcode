class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char[] newS = new char[s.length() * 2 - 2];
        char[] sCharArray = s.toCharArray();
        int j = 0;
        for (int i = 1; i < s.length(); ++i) newS[j++] = sCharArray[i];
        for (int i = 0; i < s.length() - 1; ++i) newS[j++] = sCharArray[i];

        return new String(newS).contains(s);
    }
}