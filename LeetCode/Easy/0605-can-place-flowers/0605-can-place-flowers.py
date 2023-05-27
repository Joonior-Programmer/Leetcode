class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        if len(flowerbed) == 1 and not flowerbed[0]:
            n -= 1
        if len(flowerbed) > 1 and not flowerbed[0] and not flowerbed[1]:
            flowerbed[0] = 1
            n -= 1
        for i in range(len(flowerbed) - 1):
            if not flowerbed[i] and not flowerbed[i-1] and not flowerbed[i+1]:
                n -= 1
                flowerbed[i] = 1
        if len(flowerbed) > 1 and not flowerbed[-1] and not flowerbed[-2]:
            n -= 1
        return n < 1
            
            