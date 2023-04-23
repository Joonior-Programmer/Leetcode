func checkPerfectNumber(num int) bool {
    if num % 2 != 0 {return false}
    ret := 1
    for i := 2; i * i < num; i++ {
        if num % i == 0 {ret += i + (num / i)}
    }
    return num == ret
}