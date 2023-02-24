func isIsomorphic(s string, t string) bool {
    map1 := [128]int{0}
    map2 := [128]int{0}
    for i := 0; i < len(s); i++ {
        if map1[s[i]] != map2[t[i]] { return false }
        
        map1[s[i]] = i + 1
        map2[t[i]] = i + 1
    }
    return true
}