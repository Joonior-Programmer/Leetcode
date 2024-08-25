func createTargetArray(nums []int, index []int) []int {
    ret := []int{}

	for i := 0; i < len(nums); i++ {
		ret = append(ret[:index[i]], append([]int{nums[i]}, ret[index[i]:]...)...)
	}

	return ret
}