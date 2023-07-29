class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        
        for (int i = text1.length()-1; i > -1; i--){
            for (int j = text2.length()-1; j > -1; j--){
                if (t1[i] == t2[j]) dp[i][j] += 1 + dp[i+1][j+1];
                else dp[i][j] += Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        
        return dp[0][0];
    }
}