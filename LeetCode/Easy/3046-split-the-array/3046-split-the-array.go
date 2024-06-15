func isPossibleToSplit(nums []int) bool {
    count := make([]int, 101)

    for _, v := range nums {
        if count[v] == 2 { return false }
        count[v]++
    }
    
    return true;
}