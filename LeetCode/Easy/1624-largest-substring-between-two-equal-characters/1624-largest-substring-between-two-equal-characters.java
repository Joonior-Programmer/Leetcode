class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] idx = new int[26];
        int ret = -1;
        
        for (int i = 0; i < 26; ++i) idx[i] = -1;
        
        for (int i = 0; i < s.length(); ++i){
            int temp = s.charAt(i) - 'a';
            
            if (idx[temp] != -1) ret = Math.max(ret, i-idx[temp]-1);
            else idx[temp] = i;
        }
        
        return ret;
    }
}