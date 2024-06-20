func maxDistance(position []int, m int) int {
    sort.Ints(position)
    n := len(position)

    check := func(x int) int { return 0 }
    check = func(x int) int {
        curr, start := 1, position[0]

        for i := 1; i < n; i++ {
            if position[i] - start >= x {
                start = position[i]
                curr++
            }
        }

        return curr
    }

    l, r := 1, (position[n - 1] - position[0]) / (m - 1)

    for l <= r {
        mid := (l + r) / 2
        if check(mid) >= m {
            l = mid + 1
        } else {
            r = mid - 1
        }
    }

    return r
}