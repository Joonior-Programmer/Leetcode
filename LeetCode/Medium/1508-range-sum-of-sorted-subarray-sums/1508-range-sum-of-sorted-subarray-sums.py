class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        n = len(nums)
        new_arr = []
        
        for i in range(n):
            curr = 0
            
            for j in range(i, n):
                curr += nums[j]
                new_arr.append(curr)
            
        new_arr.sort()
        
        return sum(new_arr[left-1:right]) % 1_000_000_007
        