class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row_len = len(matrix)
        col_len = len(matrix[0])

        row = 0
        col = 0

        while row < row_len:
            if matrix[row][col] > target:
                break
            row += 1
        
        row -= 1

        while col < col_len:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                return False
            col += 1
        
        return False