func checkIfExist(arr []int) bool {
    count := make([]int, 6001)

    for i := 0; i < len(arr); i++ { count[arr[i]+3000]++ }

    for i := 1500; i < 3000; i++ {
        if count[i] > 0 && count[3000-(3000-i)*2] > 0 { return true }
    }
        
    if count[3000] > 1 { return true }

    for i := 3001; i < 4500; i++ {
        if count[i] > 0 && count[i*2-3000] > 0 { return true }
    }

    return false;
}