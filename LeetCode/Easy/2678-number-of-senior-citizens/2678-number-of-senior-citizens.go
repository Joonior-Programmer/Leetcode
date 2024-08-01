func countSeniors(details []string) int {
    ret := 0
        
    for _, v := range details {
        if 60 < (v[11] - 48) * 10 + v[12] - 48 { ret++ }
    }

    return ret
}