class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        n = len(nums)
        exist = [False] * n

        for i in range(n):
            if exist[nums[i]]:
                return nums[i]
            else:
                exist[nums[i]] = True
        
        return -1