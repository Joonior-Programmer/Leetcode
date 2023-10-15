class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l, r = 0, len(nums) - 1

        while l <= r:
            mid = (l + r) // 2

            if nums[mid] == target:
                l = mid
                break
            elif nums[mid] > target:
                r = mid - 1
            else:
                l = mid + 1
        
        if l > r:
            return [-1, -1]

        r = l
        
        while l >= 0 and nums[l] == target:
            l -= 1

        while r < len(nums) and nums[r] == target:
            r += 1

        return [l+1, r - 1]