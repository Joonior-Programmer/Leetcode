func minBitFlips(start int, goal int) int {
    ret := 0
        
    for start > 0 && goal > 0 {
        if start % 2 != goal % 2 { ret++ }
        start >>= 1
        goal >>= 1
    }

    for start > 0 {
        if start % 2 == 1 { ret++ }
        start >>= 1
    }

    for goal > 0 {
        if goal % 2 == 1 { ret++ }
        goal >>= 1
    }

    return ret
}