func firstUniqChar(s string) int {
    location := make(map [rune][]int)
    ret := -1
    for i, v := range s {
        _, ok := location[v] 
        if ok {
            location[v][1] = i
        } else {
            location[v] = append(location[v], i)
            location[v] = append(location[v], i)
        }
    } 

    for _, v := range location {
        if v[0] == v[1] {
            if ret == -1 {
                ret = v[0]
            } else if ret > v[0] {
                ret = v[0]
            }
        }
    }

    return ret
}