func suggestedProducts(products []string, searchWord string) [][]string {
    n := len(products)
    m := len(searchWord)
    l, r := 0, n - 1
    ret := make([][]string, m)
    sort.Strings(products)
    
    for i := 0; i < m; i++ {
        for l <= r && (i >= len(products[l]) || products[l][i] != searchWord[i]) { l++ }
        for l <= r && (i >= len(products[r]) || products[r][i] != searchWord[i]) { r-- }
        
        ret[i] = products[l:min(l+3, r+1)]
    }
    
    return ret
}

func min(a, b int) int {
    if a < b { return a }
    return b
}