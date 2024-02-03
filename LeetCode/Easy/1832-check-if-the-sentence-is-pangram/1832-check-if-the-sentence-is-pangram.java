class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] v = new boolean[26];
        
        for (char c : sentence.toCharArray()) v[c-'a'] = true;
        
        for (int i = 0; i < 26; ++i) 
            if (!v[i]) return false;
        
        return true;
    }
}