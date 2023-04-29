class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        prefix_mod_sum = [nums[0] % k]
        result = 0
        d = {}

        for i in range(1, len(nums)):
            prefix_mod_sum.append((prefix_mod_sum[i-1] + nums[i]) % k)
        

        for v in prefix_mod_sum:
            if v in d:
                result += d[v]
                d[v] += 1
            else:
                d[v] = 1
                if v == 0:
                    result += 1
                    d[0] = 2

        return result