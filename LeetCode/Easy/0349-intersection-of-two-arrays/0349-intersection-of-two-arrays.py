class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        a = Counter(nums1)
        b = Counter(nums2)
        ret = []
        for k in a.keys():
            if k in b:
                ret.append(k)
        return ret
                
        