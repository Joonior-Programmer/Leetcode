func judgeCircle(moves string) bool {
    x , y := 0, 0
    
    for _, v := range moves {
        if v == 'U' {
            y++
        } else if v == 'D' {
            y--
        } else if v == 'R' {
            x++
        } else {
            x--
        }
    }
    
    return x == 0 && y == 0
}