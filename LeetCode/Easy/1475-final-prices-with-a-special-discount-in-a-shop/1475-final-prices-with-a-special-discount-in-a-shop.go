func finalPrices(prices []int) []int {
    n := len(prices)
    ret := make([]int, n)

    for i := 0; i < n; i++ {
        v := prices[i]
        for j := i + 1; j < n; j++ {
            if prices[j] <= prices[i] {
                v -= prices[j]
                break;
            }
        }
        ret[i] = v
    }

    return ret
}