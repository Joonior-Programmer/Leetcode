func getLucky(s string, k int) int {
    ret := 0
        
    for i := 0; i < len(s); i++ {
        temp := int(s[i]) - 96

        for temp > 0 {
            ret += temp % 10
            temp /= 10
        }
    }

    k--

    for k > 0 {
        temp := 0

        for ret > 0 {
            temp += ret % 10
            ret /= 10
        }

        ret = temp
        k--
    }

    return ret
}