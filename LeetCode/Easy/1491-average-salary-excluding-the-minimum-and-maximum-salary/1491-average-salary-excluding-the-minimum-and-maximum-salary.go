func average(salary []int) float64 {
    var maxSalary float64 = 1000
    var minSalary float64 = 1000000
    var total float64 = 0
    var temp float64
    for _, v := range salary {
        temp = float64(v)
        maxSalary = math.Max(maxSalary, temp)
        minSalary = math.Min(minSalary, temp)
        total += temp
    }
    return (total - maxSalary - minSalary) / float64(len(salary) - 2)
}