class Solution:
    def findMin(self, nums: List[int]) -> int:
        if len(nums) < 3:
            return min(nums[0], nums[-1])

        l, r = 0, len(nums) - 1
        ret = nums[0]
        
        while l <= r:
            mid = (l + r) // 2
            
            if nums[mid] > ret:
                l = mid + 1
            else:
                ret = nums[mid]
                r = mid - 1
        
        return ret