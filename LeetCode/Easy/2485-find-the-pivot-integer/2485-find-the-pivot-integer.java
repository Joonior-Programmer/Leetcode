class Solution {
    public int pivotInteger(int n) {
        int ret = 1;
        int curr = 1;
        int curr_n = (n * (n + 1)) / 2;
        
        while (curr <= curr_n){
            if (curr == curr_n) return ret;
            curr_n -= ret;
            ret++;
            curr += ret;
        }
        
        return -1;
    }
}