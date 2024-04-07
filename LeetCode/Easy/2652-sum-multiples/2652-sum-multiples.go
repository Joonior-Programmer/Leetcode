func sumOfMultiples(n int) int {
    ret := 0
        
    for i := 3; i < n + 1; i += 3 { ret += i }
    
    for i := 5; i < n + 1; i += 5 {
        if i % 3 != 0 { ret += i }
    }
    
    for i := 7; i < n + 1; i += 7 {
        if i % 3 != 0 && i % 5 != 0 { ret += i }
    }

    return ret;
}