func duplicateZeros(arr []int)  {
    temp := append([]int{}, arr...)
    i := 0
    j := 0
    n := len(arr)
    
    for j < n {
        for j < n && temp[i] == 0 {
            arr[j] = 0
            j++
            if j < n { arr[j] = 0 }
            j++
            i++
        }

        if j < n { arr[j] = temp[i] }
        j++
        i++
    }
}