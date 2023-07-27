class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        ret = []
        candidates.sort()

        def DFS(curr, idx, total):
            if total == target:
                ret.append(curr)
                return
            
            if idx >= len(candidates) or total > target:
                return
            
            DFS(curr + [candidates[idx]], idx + 1, total + candidates[idx])

            temp = idx + 1
            
            while temp < len(candidates) and candidates[idx] == candidates[temp]:
                temp += 1

            DFS(curr, temp, total)
        
        DFS([], 0, 0)

        return ret