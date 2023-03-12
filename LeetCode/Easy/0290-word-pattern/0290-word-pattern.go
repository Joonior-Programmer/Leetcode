func wordPattern(pattern string, s string) bool {
    splitted := strings.Split(s, " ")
    if len(pattern) != len(splitted) {return false}
    ret := make([]string, 26)
    used := make(map [string]bool)
    for i := 0; i < len(pattern); i++ {
        _, exist := used[splitted[i]]
        if ret[pattern[i] - 'a'] == "" && !exist {
            ret[pattern[i] - 'a'] = splitted[i]
            used[splitted[i]] = true
        } else if ret[pattern[i] - 'a'] != splitted[i] { 
            return false 
        }
    }
    return true
}