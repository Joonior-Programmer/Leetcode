class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        left, right = -1, len(nums)
        
        while right - left > 1:
            middle = (right + left) // 2
            # print(middle, left, right)
            if nums[middle] > target:
                right = middle
            elif nums[middle] < target:
                left = middle
            else:
                return middle
        return left + 1
