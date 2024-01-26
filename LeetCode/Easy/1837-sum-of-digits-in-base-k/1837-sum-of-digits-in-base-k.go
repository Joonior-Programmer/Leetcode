func sumBase(n int, k int) int {
    ret := 0
    i := 7
        
    for n < int(math.Pow(float64(k), float64(i))) { i-- }

    for i > 0 {
        temp := int(math.Pow(float64(k), float64(i)))
        ret += n / temp
        n -= n / temp * temp
        i--
    }

    return ret + n
}