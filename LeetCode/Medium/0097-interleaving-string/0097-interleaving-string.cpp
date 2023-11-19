class Solution {
public:
    int n;
    int m;
    int o;
    string s1;
    string s2;
    string s3;
    
    bool isInterleave(string s1, string s2, string s3) {
        n = s1.length();
        m = s2.length();
        o = s3.length();
        if (n + m != o) return false;
        if (n == 0 && s1 == s3) return true;
        if (m == 0 && s2 == s3) return true;
        
        vector<vector<bool>> dp(n+1, vector<bool>(m+1));
        this->s1 = s1;
        this->s2 = s2;
        this->s3 = s3;
        
        
        return dfs(0, 0, 0, dp);
    }
    
    bool dfs(int idx, int l, int r, vector<vector<bool>>& dp){
        if (idx == o) return true;
        
        if (l > n || r > m) return false;
        
        if (dp[l][r]) return false;
        
        if (l < n && s1[l] == s3[idx])
            if (dfs(idx+1, l+1, r, dp)) return true;
        
        if (r < m && s2[r] == s3[idx])
            if (dfs(idx+1, l, r+1, dp)) return true;
        
        dp[l][r] = true;
        
        return false;
    }
};