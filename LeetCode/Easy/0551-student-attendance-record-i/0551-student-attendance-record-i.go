func checkRecord(s string) bool {
    L := 0
    A := 0
    for i := 0; i < len(s); i++ {
        if s[i] == 'L' {
            L++
            if L > 2 {return false}
        } else if s[i] == 'A' {
            A++
            L = 0
            if A > 1 {return false}
        } else {L = 0}
    }
    return true
}