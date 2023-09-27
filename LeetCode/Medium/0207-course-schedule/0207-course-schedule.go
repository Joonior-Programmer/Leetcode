func canFinish(numCourses int, prerequisites [][]int) bool {
    req := make([][]int, numCourses)
    visited := make([]bool, numCourses)
    
    for i := 0; i < numCourses; i++ { req[i] = make([]int, 0) }
    
    for i := 0; i < len(prerequisites); i++ {
        req[prerequisites[i][0]] = append(req[prerequisites[i][0]], prerequisites[i][1])
    }
    
    dfs := func(course int) bool { return true }
    dfs = func(course int) bool {
        if visited[course] { return false }
        if len(req[course]) == 0 { return true }
        
        visited[course] = true
        
        for i := 0; i < len(req[course]); i++ {
            if !dfs(req[course][i]) { return false }
        }
        
        visited[course] = false
        req[course] = make([]int, 0)
        return true
    }
    
    for i := 0; i < numCourses; i++ {
        if !dfs(i) { return false }
    }
    
    return true
}