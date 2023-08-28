class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        repeat = n // 2
        temp = [0] * (n - 1)
        i = 0
        while i < repeat:
            for j in range(i, n-i-1):
                temp[j-i] = matrix[j][n-i-1]
                matrix[j][n-i-1] = matrix[i][j]

            for j in range(n-i-1, i, -1):
                temp_value = matrix[n-i-1][j]
                matrix[n-i-1][j] = temp[n-j-i-1]
                temp[n-j-i-1] = temp_value


            for j in range(n-i-1, i, -1):
                temp_value = matrix[j][i]
                matrix[j][i] = temp[n-j-i-1]
                temp[n-j-i-1] = temp_value
            
            for j in range(i, n-i-1):
                matrix[i][j] = temp[j-i]

            i += 1
            
            
        