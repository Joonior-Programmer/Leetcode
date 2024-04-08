func countStudents(students []int, sandwiches []int) int {
    count := make([]int, 2)
    n := len(sandwiches)

    for _, s := range students { count[s]++ }

    for _, v := range sandwiches {
        if count[v] == 0 { break }
        count[v]--
        n--
    }

    return n
}