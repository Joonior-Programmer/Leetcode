class Solution:
    def oddCells(self, m: int, n: int, indices: List[List[int]]) -> int:
        matrix = [[0] * n for i in range(m)]

        for row, col in indices:
            for i in range(n):
                matrix[row][i] += 1
            
            for i in range(m):
                matrix[i][col] += 1
                
        ret = 0
            
        for row in range(m):
            for col in range(n):
                if matrix[row][col] % 2:
                    ret += 1

        return ret