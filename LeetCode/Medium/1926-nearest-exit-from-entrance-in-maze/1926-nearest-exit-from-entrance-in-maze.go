type Pair struct {
    y int
    x int
}

func nearestExit(maze [][]byte, entrance []int) int {
    q := make([]Pair, 0)
    ret := -1
    temp := 0
    
    y := entrance[0]
    x := entrance[1]

    xLen := len(maze[0]) - 1
    yLen := len(maze) - 1
    
    for i := 0; i < yLen+1; i++ {
        if maze[i][0] == '.' && (i != y || 0 != x) {
            maze[i][0] = '+'
            q = append(q, Pair{i, 0})
        }

        if maze[i][xLen] == '.' && (i != y || xLen != x) {
            maze[i][xLen] = '+'
            q = append(q, Pair{i, xLen})
        }
    }
    


    for i := 0; i < xLen+1; i++ {
        if maze[0][i] == '.' && (0 != y || i != x){
            maze[0][i] = '+'
            q = append(q, Pair{0, i})
        }
        if maze[yLen][i] == '.' && (yLen != y || i != x){
            maze[yLen][i] = '+'
            q = append(q, Pair{yLen, i})
        }
    }
    

    for ret == -1 && len(q) > 0 {
        tempQ := make([]Pair, 0)
        
        for i := 0; i < len(q); i++ {
            coord := q[i]

            if coord.x == x && coord.y == y {
                ret = temp
                break
            }
            
            if coord.x > 0 && maze[coord.y][coord.x-1] == '.' {
                maze[coord.y][coord.x-1] = '+'
                tempQ = append(tempQ, Pair{coord.y, coord.x-1})
            }
            if coord.x < xLen && maze[coord.y][coord.x+1] == '.' {
                maze[coord.y][coord.x+1] = '+'
                tempQ = append(tempQ, Pair{coord.y, coord.x+1})
            }
            if coord.y > 0 && maze[coord.y-1][coord.x] == '.' {
                maze[coord.y-1][coord.x] = '+'
                tempQ = append(tempQ, Pair{coord.y-1, coord.x})
            }
            if coord.y < yLen && maze[coord.y+1][coord.x] == '.' {
                maze[coord.y+1][coord.x] = '+'
                tempQ = append(tempQ, Pair{coord.y+1, coord.x})
            }
        }
        temp++
        q = tempQ
    }
    
    return ret
}