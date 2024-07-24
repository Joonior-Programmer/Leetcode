class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        n = len(nums)
        order = []
        
        for i, v in enumerate(nums):
            temp = v

            if temp == 0:
                order.append((mapping[temp], i))
                continue

            val = 0
            power = 1
            
            while v:
                val = mapping[v % 10] * power + val
                power *= 10
                v //= 10
            
            order.append((val, i))
        
        order.sort()
        
        return [nums[v[1]] for v in order]
                