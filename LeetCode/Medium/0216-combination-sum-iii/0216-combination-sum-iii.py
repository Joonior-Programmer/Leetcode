class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        ret = []

        def DFS(curr, num, start_num):
            if sum(curr) > n:
                return

            if k == num:
                if sum(curr) == n:
                    ret.append(curr)
                return

            for i in range(start_num, min(n, 9) + 1):
                if i not in curr:
                    DFS(curr + [i], num + 1, i + 1)

        DFS([], 0, 1)
        return ret