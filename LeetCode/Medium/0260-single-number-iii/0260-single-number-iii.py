class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        nums.sort()
        
        ret = [float("inf"), float("inf")]
        idx = 0
        i = 1
        while i < len(nums):
            if nums[i] == nums[i-1]:
                i += 2
            else:
                ret[idx] = nums[i-1]
                idx += 1
                i += 1
                
                if idx == 2:
                    break
        
        if ret[1] == float("inf"):
            ret[1] = nums[-1]
        
        return ret
        
        