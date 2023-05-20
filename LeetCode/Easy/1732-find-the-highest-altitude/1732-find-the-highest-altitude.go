func largestAltitude(gain []int) int {
    cur := 0
    ret := 0
    
    for i := 0; i < len(gain); i++ {
        cur += gain[i]
        if cur > ret { ret = cur }
    }
    
    return ret
}