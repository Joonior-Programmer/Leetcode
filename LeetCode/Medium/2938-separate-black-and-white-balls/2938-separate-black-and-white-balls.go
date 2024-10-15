func minimumSteps(s string) int64 {
    curr := 0
    var ret int64= 0

    for _, v := range s {
        if v == '1' {
            curr++
        } else { ret += int64(curr) }
    }

    return ret
}