class Solution {
    public int[] countBits(int n) {
        int[] ret = new int[n + 1];
        if (n == 0) return ret;
        ++ret[1];
        if (n == 1) return ret;
        int i = 2;
        ++n;
        while (n > i){
            if (n >= i * 2){
                for (int j = 0; j < i; ++j) ret[i+j] = ret[j] + 1;
                i *= 2;
            } else {
                for (int j = 0; j < n - i; ++j) ret[i+j] = ret[j] + 1;
                i *= 2;
            }
        }
        return ret;
    }
}