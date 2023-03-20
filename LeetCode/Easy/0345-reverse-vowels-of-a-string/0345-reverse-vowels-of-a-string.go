func reverseVowels(s string) string {
    var vowel = map[byte]bool {'a':true, 'e':true, 'i':true, 'o':true, 'u':true, 'A':true, 'E':true, 'I':true, 'O':true, 'U':true}
    i := 0
    j := len(s) - 1 
    ret := strings.Split(s, "")
        
    for i < j {
        for (i < j && !vowel[s[i]]) {i++}
        for (i < j && !vowel[s[j]]) {j--}
        if (i < j) {
            ret[i], ret[j] = ret[j], ret[i]
            i++
            j--
        }
    }

    return strings.Join(ret,"")
}
