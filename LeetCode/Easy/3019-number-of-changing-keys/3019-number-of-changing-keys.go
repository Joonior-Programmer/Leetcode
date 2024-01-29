func countKeyChanges(s string) int {
    ret := 0
    prev := s[0]

    for i := 1; i < len(s); i++ {
        temp := s[i]
        if temp - 32 != prev && temp + 32 != prev && temp != prev { ret++ }
        prev = temp
    }

    return ret
}