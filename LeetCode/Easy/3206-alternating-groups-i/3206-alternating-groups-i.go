func numberOfAlternatingGroups(colors []int) int {
    n := len(colors)
    ret := 0

    for i := 1; i < n - 1; i++ {
        curr := colors[i]
        if curr != colors[i-1] && curr != colors[i+1] { ret++ } 
    }

    if colors[0] != colors[n-1] {
        if colors[0] != colors[1] { ret++ }
        if colors[n-1] != colors[n-2] { ret++ }
    }

    return ret
}