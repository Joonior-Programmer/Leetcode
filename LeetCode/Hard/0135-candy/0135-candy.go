func candy(ratings []int) int {
    n := len(ratings)
    candies := make([]int, n)
    ret := 0
    
    for i := 0; i < n; i++ { candies[i]++ }
    
    for i := 1; i < n; i++ {
        if ratings[i] > ratings[i-1] && candies[i] <= candies[i-1] {
            candies[i] = candies[i-1] + 1
        }
    }
    
    for i := n - 2; i > -1; i-- {
        if ratings[i] > ratings[i+1] && candies[i] <= candies[i+1] {
            candies[i] = candies[i+1] + 1
        }
    }
    
    for i := 0; i < n; i++ { ret += candies[i] }
    
    return ret
}