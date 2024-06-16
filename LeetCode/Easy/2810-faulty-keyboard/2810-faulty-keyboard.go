func finalString(s string) string {
    n := len(s)
    ret := make([]byte, n)
    idx := 0
    
    for _, v := range s {
        if v == 'i' {
            i := idx - 1
            j := 0
            
            for j < i {
                ret[i], ret[j] = ret[j], ret[i]
                i--
                j++
            } 

        } else { 
            ret[idx] = byte(v)
            idx++
        }
    }
    
    return string(ret[:idx])
}