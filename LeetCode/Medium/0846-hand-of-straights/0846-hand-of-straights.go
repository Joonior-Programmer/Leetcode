func isNStraightHand(hand []int, groupSize int) bool {
    if len(hand)%groupSize != 0 {
		return false
	}

	sort.Ints(hand)
	n := len(hand)
	i := 0
	count := make(map[int]int)

	for i < n {
		val := hand[i]
		temp := 0
		for i < n && val == hand[i] {
			temp++
			i++
		}

		count[val] += temp

		if count[val-groupSize+1] > 0 {
			deduct := count[val-groupSize+1]
			for j := val - groupSize + 1; j <= val; j++ {
				count[j] -= deduct
			}
		}
	}

	for _, v := range count {
		if v != 0 {
			return false
		}
	}

	return true
}