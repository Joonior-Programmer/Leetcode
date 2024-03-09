class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        l1, l2 = 0, 0
        n = len(nums1)
        m = len(nums2)
        while l1 < n and l2 < m:
            temp1, temp2 = nums1[l1], nums2[l2]
            if temp1 == temp2:
                return temp1
            elif temp1 < temp2:
                l1 += 1
            else:
                l2 += 1
        
        return -1
            
            
        
        