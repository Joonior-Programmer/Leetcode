func trap(height []int) int {
    ret := 0
    n := len(height)
    left := make([]int, n)
    right := make([]int, n)

    for i := 1; i < n; i++ { left[i] = max(left[i-1], height[i-1]) }
    for i := n-2; i > -1; i-- { right[i] = max(right[i+1], height[i+1]) }
    for i := 1; i < n-1; i++ { ret += max(0, min(left[i], right[i]) - height[i]) }
    return ret
}

func min(a, b int) int {
    if a < b { return a }
    return b
}

func max(a, b int) int {
    if a > b { return a }
    return b
}