class Solution:
    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        count1 = [0] * 101
        count2 = [0] * 101

        ret1 = 0
        ret2 = 0

        for v in nums1: count1[v] += 1
        for v in nums2: count2[v] += 1

        for i in range(1, 101):
            if count2[i]:
                ret1 += count1[i]
        
        for i in range(1, 101):
            if count1[i]:
                ret2 += count2[i]

        return [ret1, ret2]