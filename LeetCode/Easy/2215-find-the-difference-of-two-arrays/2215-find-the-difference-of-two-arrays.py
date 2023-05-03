class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        is_exist_1 = set(nums1)
        is_exist_2 = set(nums2)
        
        ret = [[],[]]

        for num in is_exist_1:
            if num not in is_exist_2:
                ret[0].append(num)
                
        for num in is_exist_2:
            if num not in is_exist_1:
                ret[1].append(num)
                
        return ret