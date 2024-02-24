func maxNumberOfBalloons(text string) int {
    count := make([]int, 26)
    ret := 99999

    for i := 0; i < len(text); i++ { count[text[i]-'a']++ }

    ret = min(ret, count['b'-'a'])
    ret = min(ret, count['a'-'a'])
    ret = min(ret, count['l'-'a'] / 2)
    ret = min(ret, count['o'-'a'] / 2)
    ret = min(ret, count['n'-'a'])

    return ret
}

func min(a, b int) int {
    if a < b { return a }
    return b
}