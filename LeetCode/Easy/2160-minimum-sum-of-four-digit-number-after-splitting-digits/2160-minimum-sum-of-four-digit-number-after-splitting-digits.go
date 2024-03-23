func minimumSum(num int) int {
    vals := make([]int, 4)
    i := 0

    for num > 0 {
        vals[i] = num % 10
        num /= 10
        i++
    }

    sort.Ints(vals)

    ret1 := vals[0]
    ret2 := vals[1]
    ret1 = ret1 * 10 + vals[2]
    ret2 = ret2 * 10 + vals[3]

    return ret1 + ret2
}