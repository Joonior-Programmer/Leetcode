class Solution:
    def numberOfPairs(self, nums1: List[int], nums2: List[int], k: int) -> int:
        n = len(nums1)
        m = len(nums2)
        ret = 0
        
        for v0 in nums1:
            for v1 in nums2:
                if v0 % (v1 * k) == 0:
                    ret += 1
        
        return ret
                