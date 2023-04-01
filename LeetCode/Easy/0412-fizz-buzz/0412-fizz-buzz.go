func fizzBuzz(n int) []string {
    ret := make([]string, n)
    for i := 1; i < n + 1; i++ {
        if i % 3 == 0 && i % 5 == 0 {
            ret[i-1] = "FizzBuzz"
        } else if i % 3 == 0 {
            ret[i-1] = "Fizz"
        } else if i % 5 == 0 {
            ret[i-1] = "Buzz"
        } else {
            ret[i-1] = strconv.Itoa(i)
        }
    }
    return ret
}