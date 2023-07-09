func canVisitAllRooms(rooms [][]int) bool {
    visited := make([]bool, len(rooms))
    dfs(0, rooms, visited)
    
    for i := 0; i < len(visited); i++ {
        if !visited[i] { return false }
    }
    
    return true
}

func dfs(room int, rooms [][]int, visited []bool) {
    visited[room] = true
    
    for _, key := range rooms[room] {
        if !visited[key] { dfs(key, rooms, visited) }
    }
}