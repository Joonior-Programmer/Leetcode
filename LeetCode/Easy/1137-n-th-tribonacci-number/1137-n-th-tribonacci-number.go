func tribonacci(n int) int {
    if n == 0 { return 0 }
    if n < 3 { return 1}
    first := 0
    second := 1
    third := 1
    for i := 3; i < n + 1; i++ {
        temp := first + second + third
        first = second
        second = third
        third = temp
    }
    return third
}