class Solution:
    def distanceBetweenBusStops(self, distance: List[int], start: int, destination: int) -> int:
        temp = 0
        temp2 = 0
        
        if start < destination:
            
            temp = sum(distance[start:destination])

            for i in range(destination, len(distance)):
                temp2 += distance[i]
            for i in range(start):
                temp2 += distance[i]
        else:
            temp += sum(distance[destination:start])
            for i in range(destination):
                temp2 += distance[i]
            for i in range(start, len(distance)):
                temp2 += distance[i]

        return min(temp2, temp)