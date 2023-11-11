class Solution {
    public int fib(int n) {
        int[] dp = new int[Math.max(2, n+1)];
        dp[1] = 1;
        
        for (int i = 2; i < n+1; ++i) dp[i] = dp[i-1] + dp[i-2];
        
        return dp[n];
    }
}