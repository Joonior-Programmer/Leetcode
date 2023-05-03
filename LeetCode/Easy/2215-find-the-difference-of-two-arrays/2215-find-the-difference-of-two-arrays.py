class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        is_exist_1 = set(nums1)
        is_exist_2 = set(nums2)
                
        return [is_exist_1.difference(is_exist_2), is_exist_2.difference(is_exist_1)]