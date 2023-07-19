func minEatingSpeed(piles []int, h int) int {
    l := 1
    r := 0
    
    for i := 0; i < len(piles); i++ {
        if piles[i] > r { r = piles[i] }
    }
    
    for l <= r {
        mid := (l + r) >> 1
        
        time := 0
        
        for i := 0; i < len(piles); i++ { 
            time += piles[i] / mid 
            if piles[i] % mid != 0 { time++ }
        }
        
        if time > h {
            l = mid + 1
        } else { r = mid - 1 }
    }
    
    return l
}