func mergeAlternately(word1 string, word2 string) string {
    n := len(word1) + len(word2)
    ret := make([]byte, n)
    j := 0
    for i := 0; i < n; i++ {
        if i < len(word1) {
            ret[j] = word1[i]
            j++
        }
        if i < len(word2) {
            ret[j] = word2[i]
            j++
        }
    }
    
    return string(ret[:])
}