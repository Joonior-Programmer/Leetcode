class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        min_num = -1
        for num in nums:
            if num > min_num + 1:
                return min_num + 1
            min_num = num
        return min_num + 1