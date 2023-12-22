func maxScore(s string) int {
    ret := 0
    count := make([]int, len(s));
    temp := 0
    if s[0] == '0' {
        count[0]++
    } else { temp++ }

    for i := 1; i < len(s); i++ {
        if s[i] == '0' {
            count[i] = count[i-1] + 1    
        } else {
            count[i] = count[i-1]
            temp++
        }
    }

    for i := 1; i < len(s); i++ {
        ret = max(ret, 2 * count[i-1] + temp - i)
    }
    
    return ret;
}


func max (a, b int) int {
    if a > b { return a }
    return b
}