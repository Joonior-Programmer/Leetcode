class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        exist = set(nums)
        ret = []
        for i in range(1, len(nums) + 1):
            if i not in exist:
                ret.append(i)
        return ret