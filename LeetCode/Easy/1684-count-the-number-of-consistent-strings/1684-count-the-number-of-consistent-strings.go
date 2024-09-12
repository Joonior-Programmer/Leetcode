func countConsistentStrings(allowed string, words []string) int {
    allow := make([]bool, 26)
    ret := len(words)

    for i := 0; i < len(allowed); i++ { allow[int(allowed[i]) - 97] = true }

    for _, word := range words {
        for _, v := range word {
            if !allow[int(v)-97]{
                ret--
                break
            }
        }
    }

    return ret
}