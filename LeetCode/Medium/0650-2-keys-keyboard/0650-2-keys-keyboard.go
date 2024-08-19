func minSteps(n int) int {
    ret := 0
        
    for n % 2 == 0 {
        ret += 2
        n /= 2
    }

    for i := 3; i < int(math.Sqrt(float64(n))) + 1; i++ {
        for n % i == 0 {
            ret += i
            n /= i
        }
    }

    if n > 1 { ret += n }

    return ret
}