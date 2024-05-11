class Solution:
    def distinctDifferenceArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        count = defaultdict(int)
        prefix = set()
        ret = [0] * n
        
        for v in nums:
            count[v] += 1
        
        for i in range(n):
            prefix.add(nums[i])
            
            if count[nums[i]] == 1:
                del count[nums[i]]
            else:
                count[nums[i]] -= 1
            
            ret[i] = len(prefix) - len(count)
        
        return ret
            
        
        