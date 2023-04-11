func findComplement(num int) int {
    ret := 0
    temp := 1
    for num > 0 {
        if num & 1 == 0 {
            ret += temp
        }
        temp *= 2
        num >>= 1
    }
    return ret
}