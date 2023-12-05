func numberOfMatches(n int) int {
    ret := 0
    
    for n > 1 {
        ret += n / 2
        n = n / 2 + n % 2
    }
    
    return ret
}