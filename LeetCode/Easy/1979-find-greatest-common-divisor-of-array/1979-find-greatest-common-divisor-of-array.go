func findGCD(nums []int) int {
    a, b := 1001, -1
    
    for _, v := range nums { a, b = min(a, v), max(b, v) }
    
    for b != 0 { 
        t := b
        b = a % b
        a = t
    }
    
    return a
}


func min(a,b int) int {
    if a < b { return a }
    return b
}


func max(a,b int) int {
    if a > b { return a }
    return b
}