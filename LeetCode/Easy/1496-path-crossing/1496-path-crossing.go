func isPathCrossing(path string) bool {
    visited := make(map[[2]int]bool)
    x := 0
    y := 0
    visited[[2]int{x,y}] = true
    
    for _, v := range path {
        if v == 'N' {
            y++
        } else if v == 'S' {
            y--
        } else if v == 'E' {
            x++
        } else {
            x--
        }
        
        if _, ok := visited[[2]int{x, y}]; ok {
			return true
		}

		visited[[2]int{x, y}] = true
    }
    
    return false
}