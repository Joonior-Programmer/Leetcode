func maxArea(height []int) int {
    i, j, ret := 0, len(height)-1, 0

    for i < j {
        temp := j - i
        if height[i] > height[j] {
            temp *= height[j]
            j--
        } else {
            temp *= height[i]
            i++
        }

        if temp > ret { ret = temp }
    }
    return ret
}