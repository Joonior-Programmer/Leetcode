class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ret = []
        zeros = 0
        all_product = 1
        for v in nums:
            if v == 0:
                zeros += 1
            else:
                all_product *= v
        
        if zeros > 1:
            return [0] * len(nums)
        
        for v in nums:
            if v == 0:
                ret.append(all_product)
            elif zeros:
                ret.append(0)
            else:
                ret.append(all_product // v)
        
        return ret