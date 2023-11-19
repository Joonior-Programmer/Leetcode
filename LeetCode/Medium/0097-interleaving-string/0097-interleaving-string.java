class Solution {
    char[] s1CharArray;
    char[] s2CharArray;
    char[] s3CharArray;
    int n;
    int m;
    int o;
    boolean[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        n = s1.length();
        m = s2.length();
        o = s3.length();
        if (n + m != o) return false;
        if (n == 0 && s1.equals(s3)) return true;
        if (m == 0 && s2.equals(s3)) return true;
        
        dp = new boolean[n+1][m+1];
        s1CharArray = s1.toCharArray();
        s2CharArray = s2.toCharArray();
        s3CharArray = s3.toCharArray();
        
        return dfs(0, 0, 0);
    }
    
    private boolean dfs(int idx, int l, int r){
        if (idx == o) return true;
        
        if (l > n || r > m) return false;
        
        if (dp[l][r]) return false;
        
        if (l < n && s1CharArray[l] == s3CharArray[idx])
            if (dfs(idx+1, l+1, r)) return true;
        
        if (r < m && s2CharArray[r] == s3CharArray[idx])
            if (dfs(idx+1, l, r+1)) return true;
        
        dp[l][r] = true;
        
        return false;
    }
}