class Solution:
    def modifiedMatrix(self, matrix: List[List[int]]) -> List[List[int]]:
        max_val = [-1] * len(matrix[0])

        for col in range(len(matrix[0])):
            for row in range(len(matrix)):
                max_val[col] = max(max_val[col], matrix[row][col])
            
        for col in range(len(matrix[0])):
            for row in range(len(matrix)):
                if matrix[row][col] == -1:
                    matrix[row][col] = max_val[col]

        return matrix