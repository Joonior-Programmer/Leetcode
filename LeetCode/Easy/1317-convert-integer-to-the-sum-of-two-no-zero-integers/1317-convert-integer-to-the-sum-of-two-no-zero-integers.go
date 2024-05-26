func getNoZeroIntegers(n int) []int {
    ret := 0
        
    for i := 1; i < n / 2 + 1; i++ {
        temp := i

        for temp > 0 {
            if temp % 10 == 0 {
                break
            }
            temp /= 10
        }

        if temp != 0 { continue; }

        temp = n - i
        
        for temp > 0 {
            if temp % 10 == 0 {
                break
            }
            temp /= 10
        }

        if temp == 0 { 
            ret = i
            break
        }
    }

    return []int{ret, n - ret}
}