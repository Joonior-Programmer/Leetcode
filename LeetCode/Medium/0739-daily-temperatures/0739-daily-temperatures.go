func dailyTemperatures(temperatures []int) []int {
    n := len(temperatures)
    hottest := 0
    ret := make([]int, n)
    
    for i := n-1; i > -1; i-- {
        curTemp := temperatures[i]
        
        if curTemp >= hottest {
            hottest = curTemp
            continue
        }
        
        days := 1
        
        for curTemp >= temperatures[i + days] { days += ret[i + days] }
        ret[i] = days
    }
    
    return ret
}