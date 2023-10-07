func generateParenthesis(n int) []string {
    target := n * 2
    ret := make([]string, 0)
    curr := make([]byte, target)
    
    dfs := func(l, r, idx int){}
    dfs = func(l, r, idx int){
        if idx == target {
            ret = append(ret, string(curr))
            return
        }
        
        if l < n {
            curr[idx] = '('
            dfs(l + 1, r, idx + 1)
        }
        
        if r < l {
            curr[idx] = ')'
            dfs(l, r + 1, idx + 1)
        }
    }
    
    dfs(0,0,0)
    
    return ret
}