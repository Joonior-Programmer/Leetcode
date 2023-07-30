func lengthOfLongestSubstring(s string) int {
    exist := make([]bool, 128)
    left, right := 0, 0
    ret := 0

    for right < len(s) {
        if !exist[s[right]] {
            exist[s[right]] = true
            right++
            ret = max(ret, right-left)
        } else {
            for s[right] != s[left] { 
                exist[s[left]] = false
                left++
            }
            left++
            right++
        }
    }

    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}