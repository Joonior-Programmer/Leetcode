class Solution {
public:
    int hammingDistance(int x, int y) {
        int ret = 0;
        while (x || y){
            if ((x & 1) != (y & 1)) ++ret;
            x >>= 1;
            y >>= 1;
        }
        return ret;
    }
};