func lemonadeChange(bills []int) bool {
    five := 0
    ten := 0

    for i := 0; i < len(bills); i++ {
        bill := bills[i]

        if (bill == 5){
            five++
        } else if (bill == 10){
            if five > 0 {
                five--
            } else { return false }
            ten++
        } else {
            if ten > 0 {
                ten--
                five--
            } else {five -= 3}

            if five < 0 { return false }
        }
    }
    return true;
}