func maxLengthBetweenEqualCharacters(s string) int {
    idx := make([]int, 26)
    ret := -1
    
    for i := 0; i < 26; i++ { idx[i] = -1 }

    for i := 0; i < len(s); i++ {
        temp := s[i] - 'a'

        if idx[temp] != -1 {
            ret = max(ret, i-idx[temp]-1)
        } else { idx[temp] = i }
    }

    return ret;
}

func max(a, b int) int {
    if a > b { return a }
    return b
}