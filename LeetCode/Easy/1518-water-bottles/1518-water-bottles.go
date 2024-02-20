func numWaterBottles(numBottles int, numExchange int) int {
    ret := numBottles
    left := 0

    for numBottles > 0 {
        numBottles += left
        left = 0
        ret += (numBottles + left) / numExchange
        left = numBottles % numExchange
        numBottles /= numExchange
    }

    return ret
}