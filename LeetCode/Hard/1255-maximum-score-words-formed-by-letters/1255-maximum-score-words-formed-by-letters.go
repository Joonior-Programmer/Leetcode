func maxScoreWords(words []string, letters []byte, score []int) int {
    n := len(words)
    ret := 0
    wordsCount := make([][]int, n)
    count := make([]int ,26)
    
    for i := 0; i < n; i++ { wordsCount[i] = make([]int, 26) }
    
    for i := 0; i < n; i++ {
        for _, v := range words[i] {
            wordsCount[i][v-'a']++
        }
    }
    
    for i := 0; i < len(letters); i++ { count[letters[i] - 'a']++ }

    dfs := func(idx, curr int){}
    dfs = func(idx, curr int){
        if idx == n {
            ret = max(ret, curr)
            return
        }
        
        currWord := wordsCount[idx]
        possible := true

        for i := 0; i < 26; i++ {
            if currWord[i] > count[i]{
                possible = false
                break
            }
        }

        if possible {
            temp := 0
            for i := 0; i < 26; i++ {
                temp += score[i] * currWord[i]
                count[i] -= currWord[i]
            }

            dfs(idx + 1, curr + temp)

            for i := 0; i < 26; i++ {
                count[i] += currWord[i]
            }

            dfs(idx + 1, curr)
        } else { dfs(idx + 1, curr) }
    }

    dfs(0, 0)

    return ret
}

func max (a, b int) int {
    if a > b { return a }
    return b
}