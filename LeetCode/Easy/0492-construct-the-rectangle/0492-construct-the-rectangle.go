func constructRectangle(area int) []int {
    var w int= int(math.Sqrt(float64(area)))
    for area % w != 0 {w--}
    ret := make([]int, 2)
    ret[0] = area/w
    ret[1] = w
    return ret
}