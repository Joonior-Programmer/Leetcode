func maximum69Number (num int) int {
    ret := num
    curr := 0
    digit := -1

    for num > 0 {
        if num % 10 == 6 {
            digit = curr
        }

        num /= 10
        curr++
    }

    if digit > -1 {
        ret += 3 * pow(digit)
    }

    return ret
}

func pow(d int) int {
    ret := 1
    
    for i := 0; i < d; i++ {
        ret *= 10
    }
    
    return ret
}