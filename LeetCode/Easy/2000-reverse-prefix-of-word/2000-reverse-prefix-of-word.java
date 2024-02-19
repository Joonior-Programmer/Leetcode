class Solution {
    public String reversePrefix(String word, char ch) {
        int r = 0;
        
        for (int i = 0; i < word.length(); ++i){
            if (word.charAt(i) == ch) break;
            ++r;
        }
        
        if (r == word.length()) return word;
        
        char[] ret = word.toCharArray();
        int l = 0;
        
        while (l < r){
            char temp = ret[l];
            ret[l++] = ret[r];
            ret[r--] = temp;
        }
        
        return new String(ret);
    }
}