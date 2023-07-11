func minReorder(n int, connections [][]int) int {
    graph := make([][]int, n)
    visited := make([]bool, n)
    
    for i := 0; i < n; i++ {
        graph[i] = make([]int, 0)
    }
    
    for i := 0; i < n-1; i++ {
        graph[connections[i][0]] = append(graph[connections[i][0]], connections[i][1])
        graph[connections[i][1]] = append(graph[connections[i][1]], -connections[i][0])
    }
        
    return dfs(0, &graph, &visited)
}

func dfs(curr int, graph *[][]int, visited *[]bool) int {
    (*visited)[curr] = true
        
    ret := 0

    for i := 0; i < len((*graph)[curr]); i++ {
        temp := (*graph)[curr][i]
        absTemp := temp

        if absTemp < 0 { absTemp = -absTemp}

        if !(*visited)[absTemp] {
            if temp > 0 { ret++ }
            ret += dfs(absTemp, graph, visited)
        }
    }

    return ret
}