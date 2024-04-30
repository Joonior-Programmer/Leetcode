class Solution {
    public String replaceDigits(String s) {
        int n = s.length();
        char[] sCharArray = s.toCharArray();
        StringBuilder ret = new StringBuilder();
        
        for (int i = 0; i < n; ++i){
            if (sCharArray[i] < 97) ret.append((char) (sCharArray[i-1] + sCharArray[i] - '0'));
            else ret.append(sCharArray[i]);
        }
        
        return ret.toString();
    }
}