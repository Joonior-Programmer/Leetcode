func decrypt(code []int, k int) []int {
    ret := make([]int, len(code))
        
    if k == 0 { return ret }

    n := len(code)

    if k > 0 {
        last := 1
        temp := 0
        i := 1

        for last <= k {
            temp += code[last]
            last++
        }

        ret[0] = temp

        for i < n {
            if last == n { last = 0 }
            temp -= code[i]
            temp += code[last]
            ret[i] = temp
            last++
            i++
        }
    } else {
        last := n + k
        temp := 0
        i := 1

        for last < n {
            temp += code[last]
            last++
        }

        ret[0] = temp

        for k < 0 {
            temp -= code[n + k]
            temp += code[i - 1]
            ret[i] = temp
            k++
            i++
        }

        for i < n {
            temp -= code[k]
            temp += code[i-1]
            ret[i] = temp
            k++
            i++
        }
    }

    return ret
}