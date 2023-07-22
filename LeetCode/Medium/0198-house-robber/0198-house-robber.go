func rob(nums []int) int {
    curr1 := 0
    curr2 := 0
    
    for i := 0; i < len(nums); i++ {
        temp := curr2
        if curr2 < curr1 + nums[i] { temp = curr1 + nums[i] }
        
        curr1 = curr2
        curr2 = temp
    }
    
    if curr1 > curr2 { return curr1 }
    return curr2
}