func maximumNumberOfStringPairs(words []string) int {
    count := make([][]bool, 26)
    
    for i := 0; i < 26; i++ { count[i] = make([]bool, 26) }
    ret := 0

    for _, word := range words {
        a := word[0] - 'a'
        b := word[1] - 'a'

        if count[a][b] {
            ret++
        } else {
            count[a][b] = true
            count[b][a] = true
        }
    }

    return ret
}