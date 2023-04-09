class Solution {
    public int hammingDistance(int x, int y) {
        int ret = 0;
        while (x != 0 || y != 0){
            if ((x & 1) != (y & 1)){
                ++ret;
            }
            x >>= 1;
            y >>= 1;
        }
        return ret;
    }
}