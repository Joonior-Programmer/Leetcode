class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        i = 0
        length = len(nums)
        ret = []
        while i < length:
            low = i
            
            while i + 1 < length and nums[i+1] == nums[i]+1:
                i += 1
            
            if low == i:
                ret.append(str(nums[low]))
            else:
                ret.append(str(nums[low]) + "->" + str(nums[i]))
                
            i += 1
        return ret
        