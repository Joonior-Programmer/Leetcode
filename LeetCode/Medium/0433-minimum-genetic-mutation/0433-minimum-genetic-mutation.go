func minMutation(startGene string, endGene string, bank []string) int {
    ret := 1
    idx := 0
    stack := make([]string, 1)
    stack[0] = startGene
    used := make([]bool, len(bank))
    
    for idx < len(stack) {
        end := len(stack)
        
        for i := idx; i < end; i++ {
            curr := stack[i]
            
            for j := 0; j < len(bank); j++ {
                if used[j] { continue }
                
                count := 0
                
                for k := 0; k < 8; k++ {
                    if curr[k] != bank[j][k] { count++ }
                }
                
                if count == 1 {
                    if bank[j] == endGene { return ret }
                    used[j] = true
                    stack = append(stack, bank[j])
                }
            }
        }
        idx = end
        ret++
    }
    
    
    return -1
}