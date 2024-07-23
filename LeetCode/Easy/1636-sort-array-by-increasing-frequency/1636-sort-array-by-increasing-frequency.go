func frequencySort(nums []int) []int {
    count := make([]int, 201)
    total := len(nums)
    n := total - 1

    for _, v := range nums { count[v+100]++ } 

    idx := n
    curr := 100

    for total > 0 {
        v := -1
        for i := 0; i < 201; i++ {
            if count[i] == curr {
                v = i;
                break
            }
        }

        if v == -1 {
            curr--
            continue;
        }

        total -= count[v]

        for i := 0; i < count[v]; i++ {
            nums[idx] = v - 100
            idx--
        } 

        count[v] = 0
    }

    return nums
}