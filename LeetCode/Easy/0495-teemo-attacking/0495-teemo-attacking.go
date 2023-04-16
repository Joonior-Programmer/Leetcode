func findPoisonedDuration(timeSeries []int, duration int) int {
    maxTime := -999
    ret := 0
    for _, v := range timeSeries {
        ret += duration
        if maxTime >= v {ret -= maxTime - v}
        maxTime = v + duration
    }
    return ret
}