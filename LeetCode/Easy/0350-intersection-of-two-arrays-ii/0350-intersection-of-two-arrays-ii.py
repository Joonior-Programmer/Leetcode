class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1.sort()
        nums2.sort()
        
        i = len(nums1) - 1
        j = len(nums2) - 1
        ret = []
        while i > -1 and j > -1:
            if nums1[i] == nums2[j]:
                ret.append(nums1[i])
                i -= 1
                j -= 1
            elif nums1[i] < nums2[j]:
                j -= 1
            else:
                i -= 1
        return ret