class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        int n = words.length;
        
        for (String word : words)
            for (int i = 0; i < word.length(); ++i) ++count[word.charAt(i)-97];
        
        for (int i = 0; i < 26; ++i) 
            if (count[i] % n != 0) return false;
        
        return true;
    }
}