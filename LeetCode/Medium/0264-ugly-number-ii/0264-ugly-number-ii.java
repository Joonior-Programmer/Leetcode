class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        int p2 = 0, p3 = 0, p5 = 0;

        for (int i = 1; i < n; ++i){
            int p2Val = dp[p2] * 2;
            int p3Val = dp[p3] * 3;
            int p5Val = dp[p5] * 5;

            int target = Math.min(p2Val, Math.min(p3Val, p5Val));
            dp[i] = target;

            if (target == p2Val) ++p2;
            if (target == p3Val) ++p3;
            if (target == p5Val) ++p5;
        }

        return dp[n-1];
    }
}