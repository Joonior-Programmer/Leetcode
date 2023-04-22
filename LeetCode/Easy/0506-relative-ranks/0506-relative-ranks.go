func findRelativeRanks(score []int) []string {
    length := len(score)
    sortedScore := make([]int, length)
    copy(sortedScore, score)
    ranks := make(map[int]string)
    ret := make([]string, length)
    sort.Ints(sortedScore)
    
    j := 1
    for i := length - 1; i > -1; i-- {
        if j > 3 {
            ranks[sortedScore[i]] = strconv.Itoa(j)
        } else if j == 1 {
            ranks[sortedScore[i]] = "Gold Medal"
        } else if j == 2 {
            ranks[sortedScore[i]] = "Silver Medal"
        } else if j == 3 {
            ranks[sortedScore[i]] = "Bronze Medal"
        }
        j++
    }
    
    for i := 0; i < length; i++ {
        ret[i] = ranks[score[i]];
    }
    
    return ret
}