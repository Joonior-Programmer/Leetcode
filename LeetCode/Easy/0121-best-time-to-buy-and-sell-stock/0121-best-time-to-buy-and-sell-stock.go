func maxProfit(prices []int) int {
    profit := 0
    minVal := prices[0]
    for i := 1; i < len(prices); i++ {
        if prices[i] < minVal { 
            minVal = prices[i]
            continue
        }
        if prices[i] - minVal > profit { profit = prices[i] - minVal }
    }
    return int(profit)
}