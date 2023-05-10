class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> ret(n, vector<int>(n));
        int cur = 1;
        int left = 0;
        int right = n;
        int top = 0;
        int bottom = n;
        int target = n * n;
        while (cur <= target) {
            for (int i = left; i < right; ++i) ret[top][i] = cur++;
            ++top;
            
            for (int i = top; i < bottom; ++i) ret[i][right-1] = cur++;
            right--;

            for (int i = right - 1; i > left - 1; i--) ret[bottom-1][i] = cur++;
            bottom--;

            for (int i = bottom - 1; i > top - 1; i--) ret[i][left] = cur++;
            ++left;
        }
        return ret;
    }
};