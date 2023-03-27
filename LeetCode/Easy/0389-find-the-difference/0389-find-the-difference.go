func findTheDifference(s string, t string) byte {
    counter := make([]int, 26)
    var ret byte
    for _, v := range s {
        counter[v-'a']++
    }
    
    for _, v := range t {
        counter[v-'a']--
    }
    
    for i, v := range counter {
        if v != 0 {
            ret = byte(i + 'a')
            break
        }
    }
    return ret
}