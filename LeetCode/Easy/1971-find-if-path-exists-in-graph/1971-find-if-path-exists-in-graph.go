func validPath(n int, edges [][]int, source int, destination int) bool {
    if source == destination {
		return true
	}

	graph := make(map[int]map[int]bool)
	visited := make(map[int]bool)
	stack := make([]int, 0)

	for _, edge := range edges {
		v0, v1 := edge[0], edge[1]
		if graph[v0] == nil {
			graph[v0] = make(map[int]bool)
		}
		graph[v0][v1] = true
		if graph[v1] == nil {
			graph[v1] = make(map[int]bool)
		}
		graph[v1][v0] = true
	}

	visited[source] = true
	stack = append(stack, source)

	for len(stack) > 0 {
		temp := make([]int, 0)

		for _, now := range stack {
			stack = stack[:len(stack)-1]

			for v := range graph[now] {
				if !visited[v] && graph[v][now] {
					if v == destination {
						return true
					}
					visited[v] = true
					temp = append(temp, v)
				}
			}
		}

		stack = append(stack, temp...)
	}

	return false
}