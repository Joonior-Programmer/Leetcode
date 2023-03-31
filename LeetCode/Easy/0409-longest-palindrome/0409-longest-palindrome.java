class Solution {
    public int longestPalindrome(String s) {
        int[] counter = new int[58];
        int ret = 0;
        
        for (char v : s.toCharArray()){
            ++counter[v - 65];
        }
        
        for (int i = 0; i < counter.length; ++i){
            ret += counter[i] / 2 * 2;
            if (ret % 2 == 0 && counter[i] % 2 == 1) {
                ++ret;
            }
        }
        
        return ret;
    }
}