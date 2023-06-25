class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        count = [0] * 20001
        
        for v in nums:
            count[v+10000] += 1
        
        for i in range(20000, -1, -1):
            if count[i] >= k:
                return i - 10000
            else:
                k -= count[i]