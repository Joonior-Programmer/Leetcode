func isInterleave(s1 string, s2 string, s3 string) bool {
    n := len(s1)
    m := len(s2)
    o := len(s3)
    
    if n + m != o { return false }
    if n == 0 && s1 == s3 { return true }
    if m == 0 && s2 == s3 { return true }

    dp := make([][]bool, n+1)
    
    for i := 0; i < n+1; i++ { dp[i] = make([]bool, m+1) }
    
    dfs := func(idx, l, r int) bool { return false }
    dfs = func(idx, l, r int) bool{
        if idx == o { return true }
        
        if l > n || r > m { return false }
        
        if dp[l][r] { return false }
        
        if l < n && s1[l] == s3[idx] {
            if dfs(idx+1, l+1, r) { return true }
        }
        
        if r < m && s2[r] == s3[idx] {
            if dfs(idx+1, l, r+1) { return true }
        }
        
        dp[l][r] = true;
        
        return false;
    }

    return dfs(0, 0, 0);
}