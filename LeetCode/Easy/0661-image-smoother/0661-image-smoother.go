func imageSmoother(img [][]int) [][]int {
    rowLen := len(img)
    colLen := len(img[0])
    ret := make([][]int, rowLen)
    
    for row := 0; row < rowLen; row++ { ret[row] = make([]int, colLen) }

    if rowLen > 1 && colLen > 1 {
        ret[0][0] = (img[0][0] + img[0][1] + img[1][0] + img[1][1]) / 4
        ret[rowLen-1][0] = (img[rowLen-1][0] + img[rowLen-1][1] + img[rowLen-2][0] + img[rowLen-2][1]) / 4
        ret[0][colLen-1] = (img[0][colLen-1] + img[0][colLen-2] + img[1][colLen-1] + img[1][colLen-2]) / 4
        ret[rowLen-1][colLen-1] = (img[rowLen-1][colLen-1] + img[rowLen-1][colLen-2] + img[rowLen-2][colLen-1] + img[rowLen-2][colLen-2]) / 4

        for col := 1; col < colLen - 1; col++ {
            ret[0][col] = (img[0][col] + img[0][col-1] + img[0][col+1] + img[1][col] +                                      img[1][col-1] + img[1][col+1]) / 6;
            ret[rowLen-1][col] = (img[rowLen-1][col] + img[rowLen-1][col-1] + img[rowLen-1][col+1] + img[rowLen-2][col] + img[rowLen-2][col-1] + img[rowLen-2][col+1]) / 6;
        }

        for row := 1; row < rowLen - 1; row++ {
            ret[row][0] = (img[row][0] + img[row-1][0] + img[row+1][0] + img[row][1] + img[row-1][1] + img[row+1][1]) / 6;
            ret[row][colLen-1] = (img[row][colLen-1] + img[row-1][colLen-1] + img[row+1][colLen-1] + img[row][colLen-2] + img[row-1][colLen-2] + img[row+1][colLen-2]) / 6;
        }
        
    } else if rowLen > 1 {
        ret[0][0] = (img[0][0] + img[1][0]) / 2
        ret[rowLen-1][0] = (img[rowLen-1][0] + img[rowLen-2][0]) / 2

        for row := 1; row < rowLen - 1; row++ {
            ret[row][0] = (img[row][0] + img[row-1][0] + img[row+1][0]) / 3
        }

    } else if colLen > 1 {
        ret[0][0] = (img[0][0] + img[0][1]) / 2
        ret[0][colLen-1] = (img[0][colLen-1] + img[0][colLen-2]) / 2

        for col := 1; col < colLen - 1; col++ {
            ret[0][col] = (img[0][col] + img[0][col-1] + img[0][col+1]) / 3
        }
    } else { return img }

    for row := 1; row < rowLen - 1; row++ {
        for col := 1; col < colLen - 1; col++ {
            ret[row][col] = (img[row][col] + img[row-1][col] + img[row+1][col] + img[row][col-1] + img[row][col+1] + img[row-1][col-1] + img[row-1][col+1] + img[row+1][col-1] + img[row+1][col+1]) / 9;
        }
    }

    return ret
}