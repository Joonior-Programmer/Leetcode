func minCostClimbingStairs(cost []int) int {
    for i := len(cost)-3; i > -1; i-- {
        if cost[i+1] > cost[i+2] {
            cost[i] += cost[i+2]
        } else {
            cost[i] += cost[i+1]
        }
    }
    
    if cost[0] > cost[1] {
        return cost[1]
    }
    return cost[0]
}