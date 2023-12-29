func distanceBetweenBusStops(distance []int, start int, destination int) int {
    temp := 0
    temp2 := 0

    if start < destination {
        for i := start; i < destination; i++ { temp += distance[i] }
        for i := 0; i < start; i++ { temp2 += distance[i] }
        for i := destination; i < len(distance); i++ { temp2 += distance[i] }
    } else {
        for i := destination; i < start; i++ { temp += distance[i] }
        for i := 0; i < destination; i++ { temp2 += distance[i] }
        for i := start; i < len(distance); i++ { temp2 += distance[i] }
    }

    return min(temp, temp2);
}

func min(a,b int) int {
    if a < b { return a }
    return b
}