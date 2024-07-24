func sortJumbled(mapping []int, nums []int) []int {
    n := len(nums)
	order := make([][]int, n)
	ret := make([]int, n)

	for i := 0; i < n; i++ { order[i] = []int{0, i} }

	for i := 0; i < n; i++ {
		temp := nums[i]
		val := 0

		if temp == 0 {
			val = mapping[0]
		} else {
			place := 1
			for temp > 0 {
				val = mapping[temp%10]*place + val
				place *= 10
				temp /= 10
			}
		}

		order[i][0] = val
	}

	sort.Slice(order, func(i, j int) bool {
		if order[i][0] != order[j][0] {
			return order[i][0] < order[j][0]
		}
		return order[i][1] < order[j][1]
	})

	for i := 0; i < n; i++ {
		ret[i] = nums[order[i][1]]
	}

	return ret
}