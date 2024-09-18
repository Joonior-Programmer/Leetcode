func largestNumber(nums []int) string {
    numStrs := make([]string, len(nums))
    
	for i, num := range nums {
		numStrs[i] = strconv.Itoa(num)
	}

	sort.Slice(numStrs, func(i, j int) bool {
		return numStrs[i]+numStrs[j] > numStrs[j]+numStrs[i]
	})

	if numStrs[0] == "0" {
		return "0"
	}

	result := ""
	for _, num := range numStrs {
		result += num
	}

	return result
}