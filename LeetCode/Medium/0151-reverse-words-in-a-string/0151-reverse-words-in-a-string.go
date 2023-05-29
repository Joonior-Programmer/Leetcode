func reverseWords(s string) string {
    words := make([]string, 0)
    left := 0
    right := 0
    
    for right < len(s) {
        for left < len(s) && s[left] == ' ' { left++ } 
        right = left
        for right < len(s) && s[right] != ' '  { right++ }
        if left != right {
            words = append(words, s[left:right])
            right++
            left = right
        }
    }
    
    for i, j := 0, len(words) - 1; i < j; i, j = i+1, j-1 {
        words[i], words[j] = words[j], words[i]
    }
    
    return strings.Join(words," ")
}