class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        n = len(nums)
        exist = { 0 : -1 }
        curr = 0

        for i in range(n):
            curr = (curr + nums[i]) % k
            if curr not in exist:
                exist[curr] = i
            elif i - exist[curr] > 1:
                return True

        return False