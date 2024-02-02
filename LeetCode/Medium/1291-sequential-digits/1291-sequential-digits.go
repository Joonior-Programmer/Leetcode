func sequentialDigits(low int, high int) []int {
    ret := make([]int, 0);
        
    for i := 1; i < 10; i++ {
        j := i + 1
        temp := i

        for j < 10 && temp < high {
            temp = (temp * 10) + j
            j++

            if temp >= low && temp <= high { ret = append(ret, temp) }
        }
    }

    sort.Ints(ret)

    return ret
}