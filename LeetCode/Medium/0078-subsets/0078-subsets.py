class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ret = []

        def dfs(idx, curr):
            if idx > len(nums):
                return

            ret.append(curr)

            for i in range(idx, len(nums)):
                dfs(i+1, curr + [nums[i]])

        dfs(0, [])

        return ret

