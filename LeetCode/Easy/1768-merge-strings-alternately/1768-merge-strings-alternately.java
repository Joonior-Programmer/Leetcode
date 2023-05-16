class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        
        char[] word1CharArray = word1.toCharArray();
        char[] word2CharArray = word2.toCharArray();
        
        int i = 0;
        int j = 0;
        
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1CharArray[i++]);
            sb.append(word2CharArray[j++]);
        }
        
        if (i < word1.length()) sb.append(word1.substring(i, word1.length()));
        else if (j < word2.length()) sb.append(word2.substring(j, word2.length()));
        
        return sb.toString();
    }
}