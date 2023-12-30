func makeEqual(words []string) bool {
    count := make([]int, 26)
    n := len(words)
    
    for _, word := range words {
        for _, v := range word { count[v-97]++ }
    }
    
    for i := 0; i < 26; i++ {
        if count[i] % n != 0 { return false }
    }
    
    return true
}