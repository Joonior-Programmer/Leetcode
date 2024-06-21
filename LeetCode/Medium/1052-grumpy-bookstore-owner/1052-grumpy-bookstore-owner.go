func maxSatisfied(customers []int, grumpy []int, minutes int) int {
    n := len(customers)
    ret := 0
    unsatisfied := 0

    for i := 0; i < minutes; i++ {
        if grumpy[i] == 1 { 
            unsatisfied += customers[i] 
        } else { ret += customers[i] }
    }

    for i := minutes; i < n; i++ {
        if grumpy[i] == 0 { ret += customers[i] }
    }

    maxVal := unsatisfied

    for i := minutes; i < n; i++ {
        if grumpy[i-minutes] == 1 { unsatisfied -= customers[i-minutes] }
        if grumpy[i] == 1 { unsatisfied += customers[i] }
        maxVal = max(maxVal, unsatisfied)
    }

    return ret + maxVal
}


func max(a, b int) int {
    if a > b { return a }
    return b
}