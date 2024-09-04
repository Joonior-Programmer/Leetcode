class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        nums = set(nums)
        ret = 0
        
        for i in range(0, 201 - diff * 2):
            if i in nums and i + diff in nums and i + diff * 2 in nums:
                ret += 1
        
        return ret