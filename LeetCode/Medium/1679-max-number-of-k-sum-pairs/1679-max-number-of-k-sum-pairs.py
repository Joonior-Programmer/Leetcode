class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        ret = 0
        i, j  = 0, len(nums) -1

        while i < j:
            temp = nums[i] + nums[j]
            if temp == k:
                ret += 1
                i += 1
                j -= 1
            elif temp < k:
                i += 1
            else:
                j -= 1
        
        return ret