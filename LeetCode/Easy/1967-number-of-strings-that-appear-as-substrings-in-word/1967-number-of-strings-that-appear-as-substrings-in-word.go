func numOfStrings(patterns []string, word string) int {
    ret := 0
    
    for _, pattern := range patterns {
        i := 0
        
        for i < len(word) {
            for i < len(word) && word[i] != pattern[0] { i++ }
            
            temp := i
            j := 0
            
            for temp < len(word) && j < len(pattern) && word[temp] == pattern[j] { 
                temp++ 
                j++
            }
            
            if j == len(pattern) { 
                ret++
                break
            }
            
            i++
        }
    }
    
    return ret
}