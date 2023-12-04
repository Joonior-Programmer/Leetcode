func largestGoodInteger(num string) string {
    ret := ""
    i := 0
    
    for i < len(num) - 2 {
        if num[i] != num[i+1] {
            i++
            continue
        }
        
        if num[i] != num[i+2] {
            i += 2
            continue
        }
        
        if len(ret) == 0 {
            ret = num[i:i+3]
            
        } else {
            val, _ := strconv.Atoi(ret) 
            if val < int((num[i]-'0')) * 111 {
                ret = num[i:i+3]
            }
        }
        i += 3
    }
    
    return ret
}