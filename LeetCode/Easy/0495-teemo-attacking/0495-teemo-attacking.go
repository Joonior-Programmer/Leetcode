func findPoisonedDuration(timeSeries []int, duration int) int {
    maxTime := -999
    ret := 0
    for i := 0; i < len(timeSeries); i++ {
        ret += duration
        if maxTime >= timeSeries[i] {ret -= maxTime - timeSeries[i] + 1}
        maxTime = timeSeries[i] + duration - 1
    }
    return ret
}