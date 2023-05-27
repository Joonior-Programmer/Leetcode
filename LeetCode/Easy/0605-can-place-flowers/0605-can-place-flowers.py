class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        count = 1
        for bed in flowerbed:
            if bed:
                count = 0
            else:
                count += 1
                if count == 3:
                    n -= 1
                    count = 1
        if count == 2:
            n -= 1
        return n < 1