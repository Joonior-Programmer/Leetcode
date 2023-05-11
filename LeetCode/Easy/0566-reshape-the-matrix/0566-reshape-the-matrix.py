class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        num_of_col = (len(mat) * len(mat[0])) // r
        if num_of_col != c:
            return mat
        
        temp = [col for row in mat for col in row]
        idx = 0
        ret = []
        
        for row in range(r):
            ret.append([])
            for col in range(c):
                ret[-1].append(temp[idx])
                idx += 1

        return ret