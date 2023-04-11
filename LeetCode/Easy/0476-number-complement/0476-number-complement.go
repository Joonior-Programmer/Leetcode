func findComplement(num int) int {
    ret := 0
    temp := num
    for temp > 0 {
        ret++
        temp >>= 1
    }
    return num ^ int(math.Pow(2, float64(ret))-1)
}