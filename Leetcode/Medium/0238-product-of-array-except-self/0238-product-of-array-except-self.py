class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        all_product = 1
        count_zero = 0
        
        for num in nums:
            if not num:
                count_zero += 1
                if count_zero == 2:
                    return [0] * len(nums)
            else:
                all_product *= num
        
        if count_zero:
            return [0 if num else all_product for num in nums]

        return [all_product // num for num in nums]
        