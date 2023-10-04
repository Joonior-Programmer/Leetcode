func myPow(x float64, n int) float64 {
    var tempN int64 = int64(n);
    
    if n < 0 {
        x = 1 / x
        n *= -1
    }
    
    helper := func(x float64, n int64) float64 { return 1 }
    helper = func(x float64, n int64) float64 { 
        if n == 0 { return 1 }
        
        half := helper(x, n / 2)
        
        if n & 1 == 1 { return x * half * half }
        return half * half
    }
    
    return helper(x, tempN);
}