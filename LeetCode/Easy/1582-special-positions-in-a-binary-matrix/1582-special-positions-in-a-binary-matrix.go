func numSpecial(mat [][]int) int {
    ret := 0
    rowLen, colLen := len(mat), len(mat[0])

    for row := 0; row < rowLen; row++ {
        for col := 0; col < colLen; col++ {
            if mat[row][col] == 1 {
                condition := true
                mat[row][col] = 0

                for i := 0; i < rowLen; i++ {
                    if mat[i][col] == 1 {
                        condition = false
                        break
                    }
                }

                if condition {
                    for i := 0; i < colLen; i++ {
                        if mat[row][i] == 1 {
                            condition = false
                            break
                        }
                    }
                }
                
                if condition { ret++ }
                mat[row][col] = 1                  
            }
        }
    }

    return ret
}