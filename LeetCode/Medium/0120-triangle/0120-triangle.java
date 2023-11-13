class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];

        List<Integer> bottom = triangle.get(n-1);

        for (int i = 0; i < n; ++i){
            dp[i] = bottom.get(i);
        }

        for (int i = n-2; i > -1; i--){
            List<Integer> curr = triangle.get(i);
            for (int j = 0; j < i+1; ++j) 
                dp[j] = curr.get(j) + Math.min(dp[j], dp[j+1]);
        }
        
        return dp[0];
    }
}