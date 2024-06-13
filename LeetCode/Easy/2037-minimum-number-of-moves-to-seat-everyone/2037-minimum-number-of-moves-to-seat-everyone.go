func minMovesToSeat(seats []int, students []int) int {
    sort.Ints(seats)
    sort.Ints(students)
    ret := 0
    
    for i := 0; i < len(seats); i++ { ret += abs(seats[i] - students[i]) }
    
    return ret
}

func abs(a int) int {
    if a < 0 { return -a }
    return a
}