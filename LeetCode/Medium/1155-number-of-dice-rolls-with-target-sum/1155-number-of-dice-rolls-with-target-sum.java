class Solution {
    int[][] memo; 
    int k;
    public int numRollsToTarget(int n, int k, int target) {
        memo = new int[n+1][target+1];
        this.k = k;
        
        return dfs(n, target);
    }
    
    private int dfs(int n, int target){
        if (target == 0){
            if (n == 0) return 1;
            return 0;
        } 

        if (target < n || n * k < target) {
            return 0;
        }

        int count = 0;
        
        if (memo[n][target] != 0) return memo[n][target];
        
        for (int i = 1; i < k + 1; ++i) 
            count = (count + dfs(n-1, target - i)) % (int)(1e9 + 7);
            
        memo[n][target] = count;
        return count;
    }
}