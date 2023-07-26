class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ret = []

        def DFS(curr, start, total):
            if total == target:
                ret.append(curr)
                return
            if start >= len(candidates) or total > target:
                return
            
            DFS(curr + [candidates[start]], start, total + candidates[start])
            DFS(curr, start+1, total)

        DFS([], 0, 0)

        return ret