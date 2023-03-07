func addDigits(num int) int {
    temp := 0
    for num > 9 {
        for num != 0 {
            temp += num % 10
            num /= 10
        }
        num = temp
        temp = 0
    }
    return num
}