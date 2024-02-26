func findCenter(edges [][]int) int {
    n := len(edges)
    count := make([]bool, n+2)

    for _, v := range edges {
        if count[v[0]] { return v[0] }
        if count[v[1]] { return v[1] }
        count[v[0]] = true
        count[v[1]] = true
    }

    return -1
}