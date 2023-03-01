func summaryRanges(nums []int) []string {
    i := 0
    length := len(nums)
    var ret []string
    for i < length {
        low := i
        
        for i + 1 < length && nums[i+1] == nums[i]+1 {i++}
        
        var buf bytes.Buffer
        buf.WriteString(strconv.Itoa(nums[low]))
        
        if low != i {
            buf.WriteString("->")
            buf.WriteString(strconv.Itoa(nums[i]))
        }
        ret = append(ret, buf.String())
        i++
    }
    return ret
}