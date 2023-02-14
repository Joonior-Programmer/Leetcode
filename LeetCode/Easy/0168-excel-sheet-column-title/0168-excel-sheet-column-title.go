func convertToTitle(columnNumber int) string {
    ret := ""
    for columnNumber > 0 {
        columnNumber -= 1
        ret = string(columnNumber % 26 + 65) + ret
        columnNumber /= 26
    }
    return ret
}