func minimumAbsDifference(arr []int) [][]int {
    sort.Ints(arr)
    ret := make([][]int, 0)
    minVal := 9999999999

    for i := 1; i < len(arr); i++ {
        temp := abs(arr[i] - arr[i-1])
        if temp < minVal {
            minVal = temp
            ret = ret[:0]
            ret = append(ret, []int{arr[i-1], arr[i]})
        } else if temp == minVal {
            ret = append(ret, []int{arr[i-1], arr[i]})
        }
    }
    
    return ret
}

func abs(a int) int {
    if a < 0 { return -a }
    return a
}