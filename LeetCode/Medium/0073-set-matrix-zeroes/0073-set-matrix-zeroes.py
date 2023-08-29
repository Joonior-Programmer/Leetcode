class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        row_len = len(matrix)
        col_len = len(matrix[0])

        stack = []

        for r in range(row_len):
            for c in range(col_len):
                if matrix[r][c] == 0:
                    stack.append([r,c])

        for r, c in stack:
            for i in range(row_len):
                matrix[i][c] = 0
            
            for i in range(col_len):
                matrix[r][i] = 0
