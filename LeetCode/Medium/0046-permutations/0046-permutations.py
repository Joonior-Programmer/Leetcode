class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ret = []
        
        if len(nums) == 1:
            return [nums[:]]
        
        for i in range(len(nums)):
            perms = self.permute(nums[:i] + nums[i+1:])
            
            for perm in perms:
                perm.append(nums[i])
            ret += perms
        
        return ret
            