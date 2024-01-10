func subtractProductAndSum(n int) int {
    product := 1
    sum := 0

    for n > 0 {
        temp := n % 10
        product *= temp
        sum += temp
        n /= 10
    }

    return product - sum
}