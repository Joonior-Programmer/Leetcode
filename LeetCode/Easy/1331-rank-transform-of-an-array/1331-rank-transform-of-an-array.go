func arrayRankTransform(arr []int) []int {
    temp := append([]int{}, arr...)
    sort.Ints(temp);
    hashMap := make(map[int]int)

    i := 0
    j := 1

    for i < len(arr) {
        hashMap[temp[i]] = j
        i++
        j++
        for i < len(arr) && temp[i] == temp[i-1] { i++ }
    }

    for k := 0; k < len(arr); k++ { arr[k] = hashMap[arr[k]] }

    return arr
}