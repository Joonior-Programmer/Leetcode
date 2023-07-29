class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        
        char[] s1 = s.toCharArray();
        char[] s2 = s.toCharArray();
        
        int j = n-1;
        
        for (int i = 0; i < n; ++i) s2[i] = s1[j--];
        
        for (int i = n - 1; i > -1; i--){
            for (j = n - 1; j > -1; j--){
                if (s1[i] == s2[j]) dp[i][j] += 1 + dp[i+1][j+1];
                else dp[i][j] += Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        
        return dp[0][0];
    }
}