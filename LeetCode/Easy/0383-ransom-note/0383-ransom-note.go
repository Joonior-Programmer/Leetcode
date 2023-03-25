func canConstruct(ransomNote string, magazine string) bool {
    if len(ransomNote) > len(magazine) {return false}
    counter := make([]int, 26)
    
    for _, v := range magazine {
        counter[v - 'a']++
    }
    
    location := 'a'
    for _, v := range ransomNote {
        location = v - 'a'
        if counter[location] < 1 { return false }
        counter[location]--
    }
    return true
}