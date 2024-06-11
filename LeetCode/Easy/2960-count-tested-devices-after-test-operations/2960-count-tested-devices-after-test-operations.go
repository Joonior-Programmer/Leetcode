func countTestedDevices(batteryPercentages []int) int {
    ret := 0
        
    for _, v := range batteryPercentages {
        if v - ret > 0 { ret++ }
    }

    return ret
}