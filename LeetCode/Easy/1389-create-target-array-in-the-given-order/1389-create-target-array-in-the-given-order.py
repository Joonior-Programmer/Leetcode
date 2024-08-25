class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        ret = []

        for i, v in zip(index, nums):
            ret.insert(i, v)
            
        return ret