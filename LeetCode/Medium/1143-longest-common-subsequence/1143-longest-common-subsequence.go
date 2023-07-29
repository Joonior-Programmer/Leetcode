func longestCommonSubsequence(text1 string, text2 string) int {
    ret := make([][]int, len(text1)+1)

    for i := 0; i < len(text1) + 1; i++ {
        ret[i] = make([]int, len(text2)+1)
    }

    for i := len(text1)-1; i > -1; i-- {
        for j := len(text2)-1; j > -1; j-- {
            if text1[i] == text2[j] {
                ret[i][j] += 1 + ret[i+1][j+1]
            } else {
                ret[i][j] += max(ret[i+1][j], ret[i][j+1])
            }
        }
    }

    return ret[0][0]
}

func max(a int, b int) int {
    if a > b {
        return a
    }
    return b
}