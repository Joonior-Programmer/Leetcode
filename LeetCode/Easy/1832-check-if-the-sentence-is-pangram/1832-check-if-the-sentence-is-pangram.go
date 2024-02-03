func checkIfPangram(sentence string) bool {
    v := make([]bool, 26)
        
    for _, c := range sentence { v[c-'a'] = true }

    for i := 0; i < 26; i++ {
        if !v[i] { return false }
    }
    
    return true
}