func arithmeticTriplets(nums []int, diff int) int {
    exist := make([]bool, 201)
    ret := 0

    for _, num := range nums { exist[num] = true }

    for i := 0; i < 201 - diff * 2; i++ {
        if exist[i] && exist[i + diff] && exist[i + diff * 2] { ret++ }
    }

    return ret
}