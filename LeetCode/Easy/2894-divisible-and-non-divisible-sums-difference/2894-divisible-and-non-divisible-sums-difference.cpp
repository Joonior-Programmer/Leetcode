class Solution {
public:
    int differenceOfSums(int n, int m) {
        int ret = n * (n + 1) / 2;

        for (int i = m; i < n + 1; i += m) ret -= i * 2;
            
        return ret;
    }
};