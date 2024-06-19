func minDays(bloomDay []int, m int, k int) int {
    if m * k > len(bloomDay) { return -1 }
    
    check := func(x int) bool { return true }
    check = func(x int) bool {
        bouquets := 0
        curr := 0
        
        for _, v := range bloomDay {
            if v <= x {
                curr++
                if curr == k{
                    curr = 0
                    bouquets++
                    if bouquets == m { return true }
                }
            } else { curr = 0 }
        }
        
        return false
    }
    
    l := int(math.Pow(10, 9) + 1)
    r := -1

    for _, v := range bloomDay {
        if v < l { l = v }
        if v > r { r = v }
    }

    for l < r{
        mid := (l + r) / 2

        if check(mid) {
            r = mid
        } else { l = mid + 1 }
    }

    return l
}