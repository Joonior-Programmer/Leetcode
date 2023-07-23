class Solution {
    public int numTilings(int n) {
        long[] ret = new long[Math.max(3, n)];
        
        ret[0] = 1L;
        ret[1] = 2L;
        ret[2] = 5L;
        
        for (int i = 3; i < n; ++i){
            ret[i] = (ret[i-1] * 2 + ret[i-3]) % 1000000007L;
        }
        
        return (int) ret[n-1];
    }
}