class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        l, r = 0, len(nums) - 1
        for i in range(r, -1, -1):
            if nums[i] == val:
                r -= 1
            else:
                break
        
        while l < r:
            if nums[l] == val:
                nums[l], nums[r] = nums[r], nums[l]
                l += 1
                r -= 1
            else:
                l += 1

            for i in range(r, -1, -1):
                if nums[i] == val:
                    r -= 1
                else:
                    break
        return r + 1