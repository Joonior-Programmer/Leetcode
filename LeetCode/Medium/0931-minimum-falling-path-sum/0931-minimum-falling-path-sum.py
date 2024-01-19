class Solution:
    def minFallingPathSum(self, matrix: List[List[int]]) -> int:
        n = len(matrix) - 1
        ret = float("inf")
        
        for i in range(n - 1, -1, -1):
            for j in range(n, -1, -1):
                if j == n:
                    matrix[i][j] = matrix[i][j] + min(matrix[i+1][j-1], matrix[i+1][j])
                elif j == 0:
                    matrix[i][j] = matrix[i][j] + min(matrix[i+1][j+1], matrix[i+1][j])
                else:
                    matrix[i][j] = matrix[i][j] + min(matrix[i+1][j-1], matrix[i+1][j], matrix[i+1][j+1])
        
        for i in range(len(matrix)):
            ret = min(ret, matrix[0][i])

        return ret