func makeGood(s string) string {
    ret := make([]byte, 0)
        
    for i := 0; i < len(s); i++ {
        length := len(ret)
        if length > 0 && abs(int(ret[length-1]) - int(s[i])) == 32 {
            ret = ret[:length-1]  
        } else { ret = append(ret, s[i]) }
    }

    return string(ret)
}

func abs(a int) int {
    if a < 0 { return -a }
    return a
}