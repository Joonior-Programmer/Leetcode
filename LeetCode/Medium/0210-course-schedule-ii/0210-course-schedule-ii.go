func findOrder(numCourses int, prerequisites [][]int) []int {
    ret := make([]int, numCourses)
    req := make([][]int, numCourses)
    idx := 0
    
    for i := 0; i < numCourses; i++ { req[i] = make([]int, 0) }
    
    for i := 0; i < len(prerequisites); i++ { req[prerequisites[i][1]] = append(req[prerequisites[i][1]], prerequisites[i][0]) }
    
    added := make([]bool, numCourses)
    visited := make([]bool, numCourses)
    
    dfs := func(course int) bool { return true }
    dfs = func(course int) bool { 
        if visited[course] { return false }
        if len(req[course]) == 0 {
            if !added[course] {
                added[course] = true
                ret[idx] = course
                idx++
            }
            return true
        }
        
        visited[course] = true
        
        for i := 0; i < len(req[course]); i++ {
            if !dfs(req[course][i]) { return false }
        }
        
        visited[course] = false
        added[course] = true
        ret[idx] = course
        idx++
        req[course] = make([]int, 0)
        return true
    }
    
    for i := 0; i < numCourses; i++ {
        if !dfs(i) { return []int{} }
    }
    
    for l, r := 0, numCourses - 1; l < r; l,r = l + 1, r - 1 {
        ret[l], ret[r] = ret[r], ret[l]
    }

    return ret
}