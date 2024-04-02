func maxDepth(s string) int {
    ret := 0
    curr := 0

    for _, v := range s {
        if v == '(' {
            curr++
            if curr > ret { ret = curr }
        } else if v == ')' { curr-- }
    }

    return ret
}