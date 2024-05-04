func numRescueBoats(people []int, limit int) int {
    sort.Ints(people)
        
    l := 0
    r := len(people) - 1
    ret := 0
    
    for r >= l {
        if people[l] + people[r] <= limit { l++ }
        r--
        ret++
    }

    return ret
}