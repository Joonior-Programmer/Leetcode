func groupAnagrams(strs []string) [][]string {
    var prime = []int64{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101}
    ret := make([][]string, 0)
    group := make(map[int64][]string)
    
    for i := 0; i < len(strs); i++ {
        var hash int64 = 1
        
        for j := 0; j < len(strs[i]); j++{
            hash = hash * prime[strs[i][j] - 'a'] % 10000000007
        }
        
        if _, ok := group[hash]; !ok { group[hash] = make([]string, 0) }
        group[hash] = append(group[hash], strs[i])
    }
    
    for _, v := range group { ret = append(ret, v) }
    
    return ret
}