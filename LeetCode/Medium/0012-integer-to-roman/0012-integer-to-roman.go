func intToRoman(num int) string {
    var ret strings.Builder

    for num / 1000 > 0 {
        ret.WriteString("M")
        num -= 1000;
    }

    if (num / 900 > 0) {
        ret.WriteString("CM")
        num -= 900;
    }

    if (num / 500 > 0) {
        ret.WriteString("D")
        num -= 500;
    }

    if (num / 400 > 0) {
        ret.WriteString("CD")
        num -= 400;
    }

    for num / 100 > 0 {
        ret.WriteString("C")
        num -= 100;
    }

    if (num / 90 > 0){
        ret.WriteString("XC")
        num -= 90;
    }

    if (num / 50 > 0){
        ret.WriteString("L")
        num -= 50;
    }

    if (num / 40 > 0){
        ret.WriteString("XL")
        num -= 40;
    }

    for num / 10 > 0 {
        ret.WriteString("X")
        num -= 10;
    }

    if (num / 9 > 0){
        ret.WriteString("IX")
        num -= 9;
    }

    if (num / 5 > 0){
        ret.WriteString("V")
        num -= 5;
    }

    if (num / 4 > 0){
        ret.WriteString("IV")
        num -= 4;
    }

    for num > 0 {
        ret.WriteString("I")
        num -= 1;
    }

    return ret.String();
}