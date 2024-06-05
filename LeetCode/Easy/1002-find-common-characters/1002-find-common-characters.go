func commonChars(words []string) []string {
    count := make([]int, 26)
    ret := make([]string, 0)
    
    for i := 0; i < 26; i++ { count[i] = 101 }

    for _, word := range words {
        temp := make([]int, 26)
        for _, v := range word { temp[v-'a']++ }

        for i := 0; i < 26; i++ { count[i] = min(count[i], temp[i]) }
    }

    for i := 0; i < 26; i++ {
        for j := 0; j < count[i]; j++ { ret = append(ret, string(i+'a')) }
    }
    
    return ret;
}

func min(a,b int) int {
    if a > b { return b }
    return a
}