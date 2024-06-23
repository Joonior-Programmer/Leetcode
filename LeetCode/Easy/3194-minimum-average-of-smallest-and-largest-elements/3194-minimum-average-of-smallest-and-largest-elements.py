class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        count = [0] * 51
        l, r = 1, 50
        ret = 9999
        
        for num in nums:
            count[num] += 1
        
        while l <= r:
            while l <= r and count[l] < 1:
                l += 1
            while l <= r and count[r] < 1:
                r -= 1
            
            if l > r:
                break

            ret = min(ret, (l+r) / 2)

            count[l] -= 1
            count[r] -= 1
        
        return ret