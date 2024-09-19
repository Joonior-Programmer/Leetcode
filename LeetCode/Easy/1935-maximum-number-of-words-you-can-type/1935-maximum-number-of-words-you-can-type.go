func canBeTypedWords(text string, brokenLetters string) int {
    broken := make(map[rune]bool)
    for _, letter := range brokenLetters {
        broken[letter] = true
    }

    ret := 0
    words := strings.Fields(text)
    
    for _, word := range words {
        isGood := true
        for _, ch := range word {
            if broken[ch] {
                isGood = false
                break
            }
        }
        if isGood {
            ret++
        }
    }

    return ret
}