class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // char[] newS = new char[s.length() * 2 - 2];
        // char[] sCharArray = s.toCharArray();
        // int j = 0;
        // for (int i = 1; i < s.length(); ++i) newS[j++] = sCharArray[i];
        // for (int i = 0; i < s.length() - 1; ++i) newS[j++] = sCharArray[i];

        // return new String(newS).contains(s);
        int len = s.length();
        for(int i = len / 2; i > 0; i--){
            if (len % i == 0 && s.charAt(i-1) == s.charAt(len - 1)){
                String part = s.substring(0, i);
                int repeat = len / i;
                if (part.repeat(repeat).equals(s)) return true;
            }
        }
        return false;
    }
}