func twoSum(numbers []int, target int) []int {
    first := 0
    second := len(numbers) - 1
    
    for first < second {
        sum := numbers[first] + numbers[second]
        
        if sum > target {
            second--
        } else if sum < target {
            first++
        } else {
            break
        }
    }
    
    return []int {first+1, second+1}
}