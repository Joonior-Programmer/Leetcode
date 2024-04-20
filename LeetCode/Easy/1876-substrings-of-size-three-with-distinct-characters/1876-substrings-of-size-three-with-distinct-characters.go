func countGoodSubstrings(s string) int {
    if len(s) < 3 { return 0 }
        
    count := make([]int, 26)
    dup := 0
    ret := 0
    count[s[0]-97]++

    for i := 1; i < 3; i++ {
        temp := s[i] - 97
        if count[temp] > 0 { dup++ }
        count[temp]++
    }

    if dup == 0 { ret++ }

    for i := 3; i < len(s); i++ {
        temp1 := s[i-3]-97
        temp2 := s[i]-97
        
        if count[temp1] > 1 { dup-- }
        count[temp1]--
        
        if count[temp2] > 0 { dup++ }
        count[temp2]++
        
        if dup == 0 { ret++ }
    }

    return ret
}