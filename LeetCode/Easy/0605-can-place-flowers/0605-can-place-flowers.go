func canPlaceFlowers(flowerbed []int, n int) bool {
    count := 1;
    for i := 0; i < len(flowerbed); i++ {
        if flowerbed[i] == 1 {
            count = 0
        } else {
            if count == 2 {
                count = 0
                n--
            }
            count++
        }
    }

    if count == 2 { n -= 1 }

    return n < 1
}