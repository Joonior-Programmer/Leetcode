func findWordsContaining(words []string, x byte) []int {
    ret := make([]int, 0)
        
    for i := 0; i < len(words); i++ {
        word := words[i]

        for j := 0; j < len(word); j++ {
            if word[j] == x {
                ret = append(ret, i)
                break
            }
        }
    }

    return ret
}