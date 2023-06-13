func asteroidCollision(asteroids []int) []int {
    ret := make([]int, 0)
    
    for _, v := range asteroids {
        condition := true
        for len(ret) > 0 && v < 0 && ret[len(ret)-1] > 0 {
            if -v > ret[len(ret)-1] {
                ret = ret[:len(ret)-1]
                continue
            } else if -v == ret[len(ret)-1] {
                ret = ret[:len(ret)-1]
            }
            condition = false
            break
        }
        if condition { ret = append(ret, v) }
        
    }
    
    return ret
}