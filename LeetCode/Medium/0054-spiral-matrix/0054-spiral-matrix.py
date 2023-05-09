class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ret = []
                #row col row col
        left, right, top, bottom = 0, len(matrix[0]), 0, len(matrix)

        while left < right and top < bottom:
            
            ret += matrix[top][left:right]
            top += 1

            for i in range(top, bottom):
                ret.append(matrix[i][right - 1])
            right -= 1

            if left >= right or top >= bottom:
                break

            for i in range(right-1, left-1, -1):
                ret.append(matrix[bottom-1][i])
            bottom -= 1

            for i in range(bottom-1, top-1, -1):
                ret.append(matrix[i][left])
            left += 1

        return ret