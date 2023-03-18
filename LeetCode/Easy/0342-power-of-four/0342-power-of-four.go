func isPowerOfFour(n int) bool {
    if n < 1 || n % 4 != 0 {return n == 1;}
    for n > 3 {
        if n % 4 != 0 {return false}
        n /= 4
    }
    return n == 1
}