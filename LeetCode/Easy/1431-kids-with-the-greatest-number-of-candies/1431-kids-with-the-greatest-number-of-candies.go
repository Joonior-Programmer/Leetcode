func kidsWithCandies(candies []int, extraCandies int) []bool {
    max := candies[0]
    ret := make([]bool, len(candies))
    
    for i := 1; i < len(candies); i++ {
        if candies[i] > max { max = candies[i]}
    }
    
    max -= extraCandies
    
    for i := 0; i < len(candies); i++ {
        ret[i] = max <= candies[i]
    }
    
    return ret
}