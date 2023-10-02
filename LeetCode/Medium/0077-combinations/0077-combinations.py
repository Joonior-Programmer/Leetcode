class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        ret = []

        def helper(curr, val):
            if len(curr) == k:
                ret.append(curr.copy())
                return
                
            for i in range(val, n + 1):
                curr.append(i)
                helper(curr, i + 1)
                curr.pop()
                
        helper([], 1)

        return ret