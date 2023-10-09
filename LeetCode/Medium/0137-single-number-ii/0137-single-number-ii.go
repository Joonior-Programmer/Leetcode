func singleNumber(nums []int) int {
     ones, twos, threes := 0, 0, 0

    for _, num := range nums {
        twos |= ones & num
        ones ^= num
        threes = ones & twos
        ones &= ^threes
        twos &= ^threes
    }

    return ones
}