func longestSquareStreak(nums []int) int {
    maxNum := 100000
	numSet := make([]bool, maxNum+1)

	for _, num := range nums {
		if num <= maxNum {
			numSet[num] = true
		}
	}

	sort.Ints(nums)
	maxStreak := 0

	for _, num := range nums {
		if !numSet[num] {
			continue
		}

		curr := num
		streakLength := 0

		for curr <= maxNum && numSet[curr] {
			streakLength++
			numSet[curr] = false

			if curr > 316 {
				break
			}
			curr *= curr
		}

		if streakLength > maxStreak {
			maxStreak = streakLength
		}
	}

	if maxStreak < 2 {
		return -1
	}
	return maxStreak
}