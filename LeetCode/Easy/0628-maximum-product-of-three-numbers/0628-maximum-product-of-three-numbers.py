class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        max1, max2, max3 = -1001, -1001, -1001
        min1, min2 = 1001, 1001

        for v in nums:
            if v > max1:
                max3 = max2
                max2 = max1
                max1 = v
            elif v > max2:
                max3 = max2
                max2 = v
            elif v > max3:
                max3 = v
            
            if v < min1:
                min2 = min1
                min1 = v
            elif v < min2:
                min2 = v
            
        return max(max1 * max2 * max3, max1 * min1 * min2)