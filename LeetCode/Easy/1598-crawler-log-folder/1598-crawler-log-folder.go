func minOperations(logs []string) int {
    ret := 0
        
    for _, log := range logs {
        if log[0] == '.' {
            if log[1] == '.' {
                ret = max(0, ret - 1)
            }
        } else { ret++ }
    }

    return ret
}


func max (a, b int) int {
    if a > b { return a }
    return b
}