class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        count = [0] * 201
        
        for v in nums:
            count[v + 100] += 1
        
        nums.sort(key = lambda x : (count[x+100], -x))
        
        return nums