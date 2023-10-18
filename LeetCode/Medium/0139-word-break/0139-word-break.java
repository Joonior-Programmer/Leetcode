class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[n] = true;
        
        for (int i = n - 1; i > -1; i--){
            for (String v : wordDict){
                if (i + v.length() <= n && s.substring(i, i + v.length()).equals(v)) dp[i] = dp[i + v.length()];
                if (dp[i]) break;
            }
        }
        return dp[0];
    }
}