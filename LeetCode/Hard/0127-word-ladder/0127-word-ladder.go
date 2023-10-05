func ladderLength(beginWord string, endWord string, wordList []string) int {
    words := make(map[string]bool)
    
    for _, word := range wordList {
        words[word] = true
    }

    if _, exists := words[endWord]; !exists {
        return 0
    }

    stack := []string{beginWord}
    idx := 0
    ret := 1

    for idx < len(stack) {
        end := len(stack)
        ret++

        for i := idx; i < end; i++ {
            idx++
            temp := stack[i]
            tempChars := []rune(temp)

            for j := 0; j < len(tempChars); j++ {
                tempChar := tempChars[j]

                for c := 'a'; c <= 'z'; c++ {
                    tempChars[j] = c
                    val := string(tempChars)

                    if words[val] {
                        if val == endWord {
                            return ret
                        }
                        stack = append(stack, val)
                        delete(words, val)
                    }
                }
                tempChars[j] = tempChar
            }
        }
    }

    return 0
}