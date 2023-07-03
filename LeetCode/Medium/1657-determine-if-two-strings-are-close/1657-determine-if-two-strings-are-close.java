class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        
        for (char v : word1.toCharArray()) ++counts1[v - 'a'];
        for (char v : word2.toCharArray()) ++counts2[v - 'a'];
        
        for (int i = 0; i < 26; ++i) 
            if (counts1[i] > 0 && counts2[i] == 0 || counts2[i] > 0 && counts1[i] == 0) return false;
        
        Arrays.sort(counts1);
        Arrays.sort(counts2);
        
        for (int i = 0; i < 26; ++i) 
            if (counts1[i] != counts2[i]) return false;
        
        
        return true;
    }
}