func countDigits(num int) int {
    original := num
    ret := 0

    for num > 0 {
        if original % (num % 10) == 0 { ret++ }
        num /= 10
    }

    return ret
}