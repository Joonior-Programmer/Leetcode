class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        is_judge = [True] * (n + 1)
        count = [0] * (n + 1)

        for v0, v1 in trust:
            is_judge[v0] = False
            count[v1] += 1
        
        for i in range(1, n+1):
            if count[i] == n - 1 and is_judge[i]:
                return i

        return -1