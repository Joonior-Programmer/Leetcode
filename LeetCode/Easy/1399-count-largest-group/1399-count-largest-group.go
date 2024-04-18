func countLargestGroup(n int) int {
    ret := 0
    maxNum := 0
    count := make([]int, 37)

    for i := 1; i < n + 1; i++ {
        curr := i
        temp := 0

        for curr > 0 {
            temp += curr % 10
            curr /= 10
        }

        count[temp]++
    }

    for i := 1; i < 37; i++ {
        if maxNum < count[i] {
            maxNum = count[i]
            ret = 1
        } else if maxNum == count[i] { ret++ }
    }

    return ret
}