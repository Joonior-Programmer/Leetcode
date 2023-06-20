func shortestToChar(s string, c byte) []int {
    n := len(s)
    ret := make([]int, n)
    val := 9999
    
    for i := 0; i < n; i++ {
        if s[i] == c {
            ret[i] = 0
            val = 1
        } else {
            ret[i] = val
            val++
        }
    }
    
    val = 9999
    
    for i := n - 1; i > -1; i-- {
        if s[i] == c {
            ret[i] = 0
            val = 1
        } else {
            if val < ret[i] {
                ret[i] = val
            }
            val++
        }
    }
    
    return ret
}