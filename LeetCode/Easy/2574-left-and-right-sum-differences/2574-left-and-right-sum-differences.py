class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        n = len(nums)
        l_sum = [0] * n
        r_sum = [0] * n

        for i in range(1, n):
            l_sum[i] = l_sum[i-1] + nums[i-1]
        
        for i in range(n-2, -1, -1):
            r_sum[i] = r_sum[i+1] + nums[i+1]

        return [abs(l_sum[i] - r_sum[i]) for i in range(n)]