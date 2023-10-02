func combine(n int, k int) [][]int {
    ret := make([][]int, 0)
    
    helper := func(val, remained int, curr []int){}
    helper = func(val, remained int, curr []int) {
        if remained == 0 {
            ret = append(ret, append([]int(nil), curr...))
            return
        }
        
        for i := val; i < n - remained + 2; i++ {
            curr = append(curr, i)
            helper(i + 1, remained - 1, curr)
            curr = curr[:len(curr)-1]
        }
    }
    
    helper(1, k, make([]int, 0))
    
    return ret
}