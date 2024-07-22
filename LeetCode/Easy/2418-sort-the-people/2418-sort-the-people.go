func sortPeople(names []string, heights []int) []string {
    n := len(names)
    
    for i := 0; i < n; i++ {
        idx := i
        for j := i; j < n; j++ {
            if heights[idx] < heights[j] { idx = j }
        }
        
        names[i], names[idx] = names[idx], names[i]
        heights[i], heights[idx] = heights[idx], heights[i]
    }

    return names
}