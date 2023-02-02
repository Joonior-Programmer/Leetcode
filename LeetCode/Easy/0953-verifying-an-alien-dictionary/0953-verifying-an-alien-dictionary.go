func isAlienSorted(words []string, order string) bool {
    var seq [26]int
    for i := 0; i < len(order); i++{
        seq[order[i] - 'a'] = i
    }
    
    for i := 0; i < len(words) - 1; i++ {
        nextLength := len(words[i+1]) - 1
        for j := 0; j < len(words[i]); j++ {
            if j > nextLength { return false } 
            if seq[words[i][j] - 'a'] < seq[words[i+1][j] - 'a'] { break }
            if seq[words[i][j] - 'a'] > seq[words[i+1][j] - 'a'] { return false }
            
        }
    }

    return true
}