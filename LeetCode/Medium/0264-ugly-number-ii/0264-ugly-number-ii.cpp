class Solution {
public:
    int nthUglyNumber(int n) {
        vector<int> dp(n);
        dp[0] = 1;

        int p2 = 0, p3 = 0, p5 = 0;

        for (int i = 1; i < n; ++i){
            int p2Val = dp[p2] * 2;
            int p3Val = dp[p3] * 3;
            int p5Val = dp[p5] * 5;

            int target = min(p2Val, min(p3Val, p5Val));
            dp[i] = target;

            if (target == p2Val) ++p2;
            if (target == p3Val) ++p3;
            if (target == p5Val) ++p5;
        }

        return dp[n-1];
    }
};