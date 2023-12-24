func minOperations(s string) int {
    c1 := '1'
    c2 := '0'
    t1 := 0
    t2 := 0
    
    for _, v := range s {
        if c1 == v { 
            t1++ 
        } else { t2++ }
        
        temp := c1
        c1 = c2
        c2 = temp
    }
    
    return min(t1, t2)
}

func min(a, b int) int {
    if a < b { return a }
    return b
}