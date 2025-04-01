class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n+1];

        for (int i = n-1; i > -1; i--){
            int point = questions[i][0];
            int bp = questions[i][1];

            dp[i] = Math.max(dp[i+1], dp[Math.min(n, bp+i+1)] + point);
        }

        return dp[0];
    }
}