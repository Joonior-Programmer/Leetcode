class Solution:
    def isToeplitzMatrix(self, matrix: List[List[int]]) -> bool:
        for i in range(len(matrix[0])):
            temp = matrix[0][i]
            for j in range(1, min(len(matrix[0])-i, len(matrix))):
                if temp != matrix[j][j+i]:
                    return False
        
        for i in range(1, len(matrix)):
            temp = matrix[i][0]
            for j in range(1, min(len(matrix)-i, len(matrix[0]))):
                if temp != matrix[j+i][j]:
                    return False

        return True