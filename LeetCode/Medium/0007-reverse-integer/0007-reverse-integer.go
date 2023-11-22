func reverse(x int) int {
    ret := 0
    
    for x != 0 {
        if ret > 214748364 || ret < -214748364 { return 0 }
        ret = ret * 10 + x % 10
        x /= 10
    }
    
    return ret
}