class Solution {
    public int minBitFlips(int start, int goal) {
        int ret = 0;
        
        while (start > 0 && goal > 0){
            if (start % 2 != goal % 2) ++ret;
            start >>= 1;
            goal >>= 1;
        }

        while (start > 0){
            if (start % 2 == 1) ++ret;
            start >>= 1;
        }

        while (goal > 0){
            if (goal % 2 == 1) ++ret;
            goal >>= 1;
        }

        return ret;
    }
}