func findNumbers(nums []int) int {
    ret := 0

    for _, num := range nums {
        temp := num
        digits := 0

        for temp > 0 {
            temp /= 10;
            digits++
        }

        if digits % 2 == 0 { ret++ }
    }

    return ret
}