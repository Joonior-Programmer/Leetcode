func findRestaurant(list1 []string, list2 []string) []string {
    exist := map[string]int{}
    
    minVal := math.MaxInt
    var j int
    ret := make([]string, 1)
    
    for i := 0; i < len(list1); i++ { exist[list1[i]] = i }
    
    for i := 0; i < len(list2); i++ {
        if _, ok := exist[list2[i]]; ok {
            j = exist[list2[i]]
            if i + j < minVal {
                minVal = i + j
                ret = ret[:1]
                ret[0] = list2[i]
            } else if i + j == minVal { ret = append(ret, list2[i])}
        }
    }
    return ret
}