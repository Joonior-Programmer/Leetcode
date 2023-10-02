class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        ret = []

        def helper(curr, val, remained):
            if not remained:
                ret.append(curr.copy())
                return
                
            for i in range(val, n - remained + 2):
                curr.append(i)
                helper(curr, i + 1, remained - 1)
                curr.pop()
                
        helper([], 1, k)

        return ret