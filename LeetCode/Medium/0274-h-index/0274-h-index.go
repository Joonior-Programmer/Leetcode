func hIndex(citations []int) int {
    n := len(citations)
    sort.Ints(citations)
    
    for i := 0; i < len(citations); i++ {
        h := n - i
        
        if citations[i] >= h { return h }
    }
    
    return 0
}