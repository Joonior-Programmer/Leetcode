func toHex(num int) string {
    if num == 0 {return "0"}
    hex := []byte {'0', '1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'}
    ret := make([]byte, 0)
    for num != 0 && len(ret) != 8 {
        ret = append(ret, hex[num & 15])
        num >>= 4
    }
    
    for i, j := 0, len(ret) - 1 ; i < j; i, j = i + 1, j -1 {
        ret[i], ret[j] = ret[j], ret[i]
    }
    
    return string(ret[:])
}