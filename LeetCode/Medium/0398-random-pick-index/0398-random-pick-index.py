class Solution:

    def __init__(self, nums: List[int]):
        self.nums = nums

    def pick(self, target: int) -> int:
        idx = random.randrange(len(self.nums))
        
        while self.nums[idx] != target:
            idx = random.randrange(len(self.nums))
            
        return idx


# Your Solution object will be instantiated and called as such:
# obj = Solution(nums)
# param_1 = obj.pick(target)