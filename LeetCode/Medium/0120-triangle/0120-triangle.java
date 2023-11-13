class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        List<Integer> bottom = triangle.get(n-1);

        for (int i = 0; i < n; ++i){
            dp[n-1][i] = bottom.get(i);
        }

        for (int i = triangle.size()-2; i > -1; i--){
            List<Integer> curr = triangle.get(i);
            for (int j = 0; j < i+1; ++j) {
                int temp = curr.get(j);
                dp[i][j] = Math.min(temp + dp[i+1][j], temp + dp[i+1][j+1]);
            }
                
        }
        
        return dp[0][0];
    }
}