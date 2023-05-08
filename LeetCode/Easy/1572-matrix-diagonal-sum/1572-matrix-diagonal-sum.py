class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        ret = 0
        length = len(mat)
        for i in range(length // 2):
            ret += mat[i][i] + mat[i][-1-i] + mat[-1-i][i] + mat[-1-i][-1-i]
        if length % 2 != 0:
            ret += mat[length//2][length//2]
        return ret