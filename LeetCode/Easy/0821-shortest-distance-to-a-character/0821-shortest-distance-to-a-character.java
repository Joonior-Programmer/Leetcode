class Solution {
    public int[] shortestToChar(String s, char c) {
        char[] sCharArray = s.toCharArray();
        int n = sCharArray.length;
        int[] ret = new int[n];
        int val = 9999;
        
        for (int i = 0; i < n; ++i){
            if (sCharArray[i] == c){
                ret[i] = 0;
                val = 1;
            } else {
                ret[i] = val++;
            }
        }
        
        val = 9999;
        
        for (int i = n - 1; i > -1; i--){
            if (sCharArray[i] == c){
                ret[i] = 0;
                val = 1;
            } else {
                ret[i] = Math.min(ret[i], val++);
            }
        }
        
        return ret;
    }
}