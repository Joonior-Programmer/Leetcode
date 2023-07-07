class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        ret = 0
        count = []
        temp = 0

        for v in nums:
            if v == 0:
                if temp:
                    count.append(temp)
                    temp = 0
                count.append(0)
            else:
                temp += 1
        
        if temp:
            count.append(temp)

        if len(count) > 1:
            ret = max(ret, count[1], count[-1])

        for i in range(1, len(count) - 1):
            ret = max(ret, count[i-1] + count[i+1])

        if len(count) == 1:
            return count[0] - 1 if count[0] != 0 else 0
        
        return ret

        
