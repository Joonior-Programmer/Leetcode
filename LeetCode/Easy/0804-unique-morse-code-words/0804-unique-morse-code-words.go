func uniqueMorseRepresentations(words []string) int {
    mos := []string{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}
    
    ret := make(map[string]bool)
    
    for _, word := range words {
        temp := ""
        
        for _, v := range word { temp += mos[v-'a'] }
        
        ret[temp] = true
    }
    
    return len(ret)
}