func summaryRanges(nums []int) []string {
    i := 0
    length := len(nums)
    var ret []string
    for i < length {
        low := i
        high := i
        for high + 1 < length && nums[high+1] == nums[high]+1 {high++}
        
        if low == high {
            ret = append(ret, strconv.Itoa(nums[low]))
        } else {
            ret = append(ret, strconv.Itoa(nums[low]) + "->" + strconv.Itoa(nums[high]))
        }
        
        i = high + 1
    }
    return ret
}