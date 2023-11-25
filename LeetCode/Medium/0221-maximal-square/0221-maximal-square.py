class Solution:
    def maximalSquare(self, matrix: List[List[str]]) -> int:
        ret = 0
        row_len = len(matrix)
        col_len = len(matrix[0])
        dp = [[0] * col_len for i in range(row_len)]

        for row in range(row_len):
            for col in range(col_len):
                if matrix[row][col] == "1":
                    dp[row][col] = 1
                    ret = 1

        for row in range(1, row_len):
            for col in range(1, col_len):
                if dp[row][col]:
                    dp[row][col] = min(dp[row-1][col], dp[row][col-1], dp[row-1][col-1]) + 1
                    ret = max(ret, dp[row][col])
        
        return ret ** 2