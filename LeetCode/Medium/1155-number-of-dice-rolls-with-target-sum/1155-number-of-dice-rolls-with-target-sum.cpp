class Solution {
public:
    int numRollsToTarget(int n, int k, int target) {
        vector<vector<int>> memo(n+1, vector<int>(target+1));
        return dfs(n, k, target, memo);
    }
    
    int dfs(int n, int k, int target, vector<vector<int>>& memo){
        if (target == 0){
            if (n == 0) return 1;
            return 0;
        }
        
        if (target < n || n * k < target) return 0;
        
        if (memo[n][target] != 0) return memo[n][target];
        
        int count = 0;
        
        for (int i = 1; i < k + 1; ++i) count = (count + dfs(n-1, k, target - i, memo)) % (int) (1e9+7);
        
        memo[n][target] = count;
        return count;
    }
};