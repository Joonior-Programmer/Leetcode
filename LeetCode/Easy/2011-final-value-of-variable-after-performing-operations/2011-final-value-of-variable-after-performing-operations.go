func finalValueAfterOperations(operations []string) int {
    ret := 0
        
    for _, v := range operations {
        if v[0] == '+' || v[2] == '+' {
            ret++
        } else { ret-- }
    }

    return ret
}