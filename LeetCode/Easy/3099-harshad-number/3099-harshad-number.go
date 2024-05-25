func sumOfTheDigitsOfHarshadNumber(x int) int {
    copyX := x
    ret := 0
    
    for copyX > 0 {
        ret += copyX % 10
        copyX /= 10
    }
    
    if x % ret != 0 { return -1 }
    return ret
}