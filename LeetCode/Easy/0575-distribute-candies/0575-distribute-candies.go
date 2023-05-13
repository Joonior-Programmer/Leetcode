func distributeCandies(candyType []int) int {
    count := make([]int, 200001)
    distinct := 0
    length := 0
    for i := 0; i < len(candyType); i++ {
        if count[candyType[i] + 100000] == 0 {
            distinct++
            count[candyType[i] + 100000]++
        }
        length++
    }
    if length / 2 < distinct { return length / 2 }
    return distinct
}