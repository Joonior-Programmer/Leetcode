func lastVisitedIntegers(nums []int) []int {
    var seen []int
	var ret []int
	k := 0

	for _, v := range nums {
		if v != -1 {
			seen = append([]int{v}, seen...) // Prepend to the slice
			k = 0
		} else {
			k++
			if k > len(seen) {
				ret = append(ret, -1)
			} else {
				ret = append(ret, seen[k-1])
			}
		}
	}

	return ret
}