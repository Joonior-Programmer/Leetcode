class Solution {
    public int firstUniqChar(String s) {
        int[] ret = new int[26];
        char[] sCharArray = s.toCharArray();
        for (char v : sCharArray){
            ++ret[v - 'a'];
        }
        
        for (int i = 0; i < sCharArray.length; ++i){
            if (ret[sCharArray[i] - 'a'] == 1) return i;
        }
        
        return -1;
    }
}