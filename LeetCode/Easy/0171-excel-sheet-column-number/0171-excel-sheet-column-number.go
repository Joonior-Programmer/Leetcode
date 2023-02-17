func titleToNumber(columnTitle string) int {
    ret := 0
    power := len(columnTitle)
    for i := 0; i < len(columnTitle); i++ {
        pow := 1
        for j := 1; j < power; j++ {
            pow *= 26 
        }
        ret += (int(columnTitle[i]) - 64) * pow
        power--
    }
    return ret
}