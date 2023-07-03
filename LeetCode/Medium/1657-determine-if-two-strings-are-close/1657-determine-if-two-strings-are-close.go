func closeStrings(word1 string, word2 string) bool {
    counts1 := make([]int, 26)
    counts2 := make([]int, 26)
    
    for i := 0; i < len(word1); i++ { counts1[word1[i] - 'a']++ }
    for i := 0; i < len(word2); i++ { counts2[word2[i] - 'a']++ }
    
    for i := 0; i < 26; i++ {
        if counts1[i] > 0 && counts2[i] == 0 || counts2[i] > 0 && counts1[i] == 0 {
            return false
        }
    }
    
    sort.Ints(counts1)
    sort.Ints(counts2)
    
    for i := 0; i < 26; i++ {
        if counts1[i] != counts2[i] { return false }
    }
    
    return true
}