func maxProfit(prices []int) int {
    ret := 0
    effectiveBuy := 10001
    
    for i := 0; i < len(prices); i++ {
        ret = max(ret, prices[i] - effectiveBuy)
        effectiveBuy = min(effectiveBuy, prices[i] - ret)
    }
    
    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}

func min(a,b int) int {
    if a < b { return a }
    return b
}