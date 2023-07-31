func maxProfit(prices []int, fee int) int {
    ret := 0
    effectiveBuyPrice := prices[0]
    
    for i := 1; i < len(prices); i++ {
        if ret < prices[i] - effectiveBuyPrice - fee {
            ret = prices[i] - effectiveBuyPrice - fee
        }
        
        if effectiveBuyPrice > prices[i] - ret { effectiveBuyPrice = prices[i] - ret }
    }
    
    return ret
}