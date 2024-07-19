func numberOfPoints(nums [][]int) int {
    count := make([]bool, 101)
    ret := 0

    for _, v := range nums {
        for i := v[0]; i < v[1] + 1; i++ {
            if !count[i] {
                ret++
                count[i] = true
            }
        }
    }

    return ret;
}