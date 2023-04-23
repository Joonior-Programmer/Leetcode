func checkPerfectNumber(num int) bool {
    if num % 2 != 0 || num < 3 {return false}
    ret := 1
    for i := 2; i < int(math.Sqrt(float64(num))) + 1; i++ {
        if num % i == 0 {ret += i + (num / i)}
    }
    return num == ret
}