class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        ret = 0
        length = len(mat) - 1
        for i in range(length + 1):
            ret += mat[i][i]
        if len(mat) % 2 == 0:
            for i in range(length + 1):
                ret += mat[i][length-i]
        else:
            for i in range(length + 1):
                if i != length // 2:
                    ret += mat[i][length-i]
        return ret