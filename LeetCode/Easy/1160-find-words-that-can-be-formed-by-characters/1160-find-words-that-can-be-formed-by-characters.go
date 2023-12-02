func countCharacters(words []string, chars string) int {
    count := make([]int, 26)
    ret := 0
    
    for i := 0; i < len(chars); i++ { count[chars[i]-'a']++ }
    
    for _, word := range words {
        tempCount := make([]int, 26)
        condition := true
        
        for i := 0; i < len(word); i++ {
            temp := word[i] - 'a'
            tempCount[temp]++
            
            if tempCount[temp] > count[temp] {
                condition = false
                break
            }
        }
        
        if condition { ret += len(word) }
    }
    
    return ret
}