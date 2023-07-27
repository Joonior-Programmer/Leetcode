func combinationSum2(candidates []int, target int) [][]int {
    sort.Ints(candidates)
    ret := make([][]int, 0)
    
    dfs := func(curr []int, idx int, sum int){}
    dfs = func(curr []int, idx int, sum int){
        if sum == target {
            ret = append(ret, append([]int(nil), curr...))
            return
        }
        
        if idx >= len(candidates) || sum > target { return }
        
        curr = append(curr, candidates[idx])
        dfs(curr, idx + 1, sum + candidates[idx])
        curr = curr[:len(curr)-1]
        
        temp := idx + 1
        
        for temp < len(candidates) && candidates[temp] == candidates[idx] { temp++ }
        
        dfs(curr, temp, sum)
    }
    
    dfs(make([]int, 0), 0, 0)
    
    return ret
}