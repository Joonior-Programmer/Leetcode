class Solution:
    def minKBitFlips(self, nums: List[int], k: int) -> int:
        n = len(nums)
        curr = 0
        xor = 1
        ret = 0

        for i in range(k - 1):
            xor = (xor << 1) + 1

        for v in nums:
            curr = curr * 2 + v
            
        while n:
            if curr & 1 == 0:
                curr ^= xor
                ret += 1
            curr >>= 1
            n -= 1
        
        if curr:
            return -1
        
        return ret
        