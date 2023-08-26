func minWindow(s string, t string) string {
    count := make([]int, 128)
    needCount := len(t)
    
    start := 0
    end := 100001
    l := 0
    
    for i := 0; i < needCount; i++ { count[t[i]]++ }
    
    for r := 0; r < len(s); r++ {
        
        if count[s[r]] > 0 { needCount-- }
        count[s[r]]--
        
        if needCount == 0 {
            
            for count[s[l]] != 0 {
                count[s[l]]++
                l++
            }
            
            if end - start > r - l {
                end = r
                start = l
            }
            
            needCount++
            count[s[l]]++
            l++
        }
    }
    
    if end == 100001 { return "" }
    
    return s[start:end+1]
}