func isArraySpecial(nums []int) bool {
    isOdd := true
        
    if nums[0] % 2 == 0 { isOdd = false }

    for i := 1; i < len(nums); i++ {
        temp := true
        if nums[i] % 2 == 0 { temp = false }
        if temp == isOdd { return false }

        isOdd = !isOdd
    }

    return true
}