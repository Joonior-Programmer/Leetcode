func numJewelsInStones(jewels string, stones string) int {
    types := make([]bool, 128)
    ret := 0
    
    for _, jewel := range jewels { types[jewel] = true }
    
    for _, stone := range stones {
        if types[stone] { ret++ }
    }
    
    return ret
}