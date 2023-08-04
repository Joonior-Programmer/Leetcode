func eraseOverlapIntervals(intervals [][]int) int {
    sort.Slice(intervals, func (a, b int) bool {
        return intervals[a][1] < intervals[b][1]
    })
    ret := 0
    left, right, nextIdx := 0, 1, 1
    
    for right < len(intervals) {
        if intervals[left][1] > intervals[right][0] {
            ret++
        } else {
            left = nextIdx
        }
        right++
        nextIdx = right
    }
    
    return ret
    
}