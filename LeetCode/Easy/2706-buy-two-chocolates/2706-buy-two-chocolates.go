func buyChoco(prices []int, money int) int {
    first, second := 101, 101
    
    for _, price := range prices {
        if price <= first {
            second = first
            first = price
        } else if price < second {
            second = price
        }
    }
    
    if first + second > money { return money }
    
    return money - first - second
}