func numSteps(s string) int {
    ret := 0
    lead := 0
    r := len(s) - 1;

    for r > 0 {
        temp := int(s[r]) - 48 + lead
        if temp == 0 {
            ret++
            lead = 0
        } else if (temp == 2) {
            ret++
            lead = 1
        } else {
            ret += 2
            lead = 1
        }

        r--
    }

    if lead == 1 { ret++ }

    return ret
}