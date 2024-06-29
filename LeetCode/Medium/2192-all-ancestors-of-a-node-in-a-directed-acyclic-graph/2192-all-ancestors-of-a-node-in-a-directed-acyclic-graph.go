func getAncestors(n int, edges [][]int) [][]int {
    graph := make([]map[int]bool, n)
	ances := make([][]bool, n)
	ret := make([][]int, n)
	lev := make([]int, n)

	for i := 0; i < n; i++ {
		graph[i] = make(map[int]bool)
		ances[i] = make([]bool, n)
		ret[i] = []int{}
	}

	for _, edge := range edges {
		graph[edge[0]][edge[1]] = true
		lev[edge[1]]++
	}

	q := []int{}
	for i := 0; i < n; i++ {
		if lev[i] == 0 {
			q = append(q, i)
		}
	}

	for len(q) > 0 {
		curr := q[0]
		q = q[1:]

		for v := range graph[curr] {
			if !ances[v][curr] {
				ances[v][curr] = true
				for i := 0; i < n; i++ {
					if ances[curr][i] {
						ances[v][i] = true
					}
				}
			}

			lev[v]--

			if lev[v] == 0 {
				q = append(q, v)
			}
		}
	}

	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if ances[i][j] {
				ret[i] = append(ret[i], j)
			}
		}
	}

	return ret
}