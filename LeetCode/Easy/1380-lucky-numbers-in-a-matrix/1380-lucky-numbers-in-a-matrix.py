class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        row_min = [min(v) for v in matrix]
        # col_max = [0] * len(matrix[0])
        col_max = [max(v) for v in zip(*matrix)]
        ret = []

        # for col in range(len(matrix[0])):
        #     temp = 0
        #     for row in range(len(matrix)):
        #         temp = max(temp, matrix[row][col])
        #     col_max[col] = temp
        
        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                if matrix[row][col] == row_min[row] == col_max[col]:
                    ret.append(row_min[row])

        return ret