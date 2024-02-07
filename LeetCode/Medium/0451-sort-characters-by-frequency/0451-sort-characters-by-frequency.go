func frequencySort(s string) string {
    count := make([]int, 128)
    freq := make([]int, len(s) + 1)
    ret := make([]byte, len(s))

    for _, v := range s {
        count[v]++
    }
    
    for _, v := range count {
        freq[v]++
    }

    i := len(freq) - 1
    idx := 0

    for i > 0 {
        for freq[i] > 0 {
            for j := 0; j < 128; j++ {
                if count[j] == i {
                    for k := 0; k < i; k++ {
                        ret[idx] = byte(j)
                        idx++
                    }

                    freq[i]--
                }
            }
        }
        i--

    }

    return string(ret[:])

}