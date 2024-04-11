func removeKdigits(num string, k int) string {
    n := len(num)
    ret := make([]byte, 1)
    ret[0] = num[0]

    for i := 1; i < n; i++ {
        temp := num[i]
        for k > 0 && len(ret) > 0 {
            if ret[len(ret)-1] > temp {
                ret = ret[:len(ret)-1]
                k--
            } else { break }
        }

        if len(ret) > 0 || temp != '0' { ret = append(ret, temp) }
    }

    for k > 0 && len(ret) > 0 {
        ret = ret[:len(ret)-1]
        k--
    }

    if len(ret) == 0 { return "0" }

    return string(ret[:])
}