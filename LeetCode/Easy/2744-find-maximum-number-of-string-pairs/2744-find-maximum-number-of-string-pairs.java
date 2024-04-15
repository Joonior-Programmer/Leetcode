class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        boolean[][] count = new boolean[26][26];
        int ret = 0;
        
        for (String word : words){
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';
            
            if (count[a][b]) ++ret;
            
            count[a][b] = true;
            count[b][a] = true;
        }
        
        return ret;
    }
}