func totalNQueens(n int) int {
    col := make([]bool, n)
    lDiag := make(map[int]bool)
    rDiag := make(map[int]bool)
    
    dfs := func(row int) int { return 0 }
    dfs = func(row int) int { 
        ret := 0
        
        for i := 0; i < n; i++ {
            l := i + row
            r := i - row
            
            
            if !col[i] && !lDiag[l] && !rDiag[r] {
                if row == n - 1 { return 1 }
                col[i] = true
                lDiag[l] = true
                rDiag[r] = true
                ret += dfs(row + 1)
                col[i] = false
                lDiag[l] = false
                rDiag[r] = false
            }
        }
        
        return ret
    }
    
    return dfs(0)
}