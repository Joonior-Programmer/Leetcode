func letterCombinations(digits string) []string {
    var dial = []string{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}
    n := len(digits)
    ret := make([]string, 0)
    
    dfs := func(curr string, idx int){}
    dfs = func(curr string, idx int){
        if idx == n {
            ret = append(ret, curr)
            return
        }
        
        for i := 0; i < len(dial[digits[idx] - '2']); i++ {
            dfs(curr + string(dial[digits[idx] - '2'][i]), idx + 1)
        }
    }
    
    if n > 0 { dfs("", 0) }
    
    return ret
}