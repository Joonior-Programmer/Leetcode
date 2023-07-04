func equalPairs(grid [][]int) int {
    exist := make(map[int]int)
    ret := 0
    for i := 0; i < len(grid); i++ {
        hashed := hash(grid[i])
        if _, ok := exist[hashed]; ok {
            exist[hashed]++
        } else {
            exist[hashed] = 1
        }
    }

    for c := 0; c < len(grid); c++ {
        hashed := 5

        for r := 0; r < len(grid); r++ {
            hashed = hashed * 5 + grid[r][c]
        }

        if v, ok := exist[hashed]; ok {
            ret += v
        }
    }

    return ret
}

func hash(arr []int) int {
    hash := 5
    
    for i := 0; i < len(arr); i++ { hash = hash * 5 + arr[i] }
    
    return hash
}