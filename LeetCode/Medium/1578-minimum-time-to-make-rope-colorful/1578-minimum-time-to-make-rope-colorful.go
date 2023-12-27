func minCost(colors string, neededTime []int) int {
    ret := 0
    prev := colors[0]
    prevTime := neededTime[0]

    for i := 1; i < len(neededTime); i++ {
        if prev == colors[i] {
            ret += min(prevTime, neededTime[i])
            prevTime = max(prevTime, neededTime[i])
        } else {
            prev = colors[i]
            prevTime = neededTime[i]
        }
    }

    return ret;
}
               
func min(a, b int) int {
   if a < b { return a }
   return b
}

func max(a, b int) int {
   if a > b { return a }
   return b
}
                       