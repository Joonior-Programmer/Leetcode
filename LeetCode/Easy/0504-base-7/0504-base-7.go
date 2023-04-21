func convertToBase7(num int) string {
    if num == 0 {return "0"}

    ret := "";

    if num < 0 {
        ret += "-"
        num *= -1
    }

    var power float64= 8
    for num < int( math.Pow(7, power) ) {power--}

    for power > -1 {
        ret += strconv.Itoa(num / int(math.Pow(7, power)))
        num %= int(math.Pow(7, power))
        power--
    }

    return ret
}