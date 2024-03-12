func numberOfSteps(num int) int {
    ret := 0
    
    for num > 0 {
        if num % 2 == 0 {
            num /= 2
        } else {
            num--
        }
        
        ret++
    }
    
    return ret
}