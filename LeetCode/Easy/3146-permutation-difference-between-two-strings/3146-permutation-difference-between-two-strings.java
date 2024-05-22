class Solution {
    public int findPermutationDifference(String s, String t) {
        int ret = 0;
        int[] idxs = new int[26];
        
        for (int i = 0; i < s.length(); ++i) idxs[s.charAt(i)-'a'] = i;
        
        for (int i = 0; i < s.length(); ++i) ret += Math.abs(idxs[t.charAt(i)-'a'] - i);
        
        return ret;
    }
}