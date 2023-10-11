class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        down, up = 0, len(matrix) - 1
        left, right = 0, len(matrix[0]) - 1
        
        while down <= up:
            mid = (down + up) // 2
            if matrix[mid][0] > target:
                up = mid - 1
            elif matrix[mid][0] < target:
                if matrix[mid][-1] >= target:
                    break
                down = mid + 1
            else:
                return True

        row = matrix[mid]

        while left <= right:
            mid = (left + right) // 2

            if row[mid] > target:
                right = mid - 1
            elif row[mid] < target:
                left = mid + 1
            else:
                return True

        return False