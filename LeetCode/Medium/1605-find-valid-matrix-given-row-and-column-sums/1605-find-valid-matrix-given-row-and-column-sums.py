class Solution:
    def restoreMatrix(self, rowSum: List[int], colSum: List[int]) -> List[List[int]]:
        row_len = len(rowSum)
        col_len = len(colSum)
        ret = [[0] * col_len for i in range(row_len)]
        
        for i in range(row_len * col_len):
            r, c, r_min_num, c_min_num = -1, -1, float("inf"), float("inf")
            
            for i in range(row_len):
                if rowSum[i] and rowSum[i] < r_min_num:
                    r = i
                    r_min_num = rowSum[i]
            
            for i in range(col_len):
                if colSum[i] and colSum[i] < c_min_num:
                    c = i
                    c_min_num = colSum[i]
            
            if r == -1 and c == -1:
                break
                
            target = min(rowSum[r], colSum[c])
            ret[r][c] = target
            rowSum[r] -= target
            colSum[c] -= target
        
        return ret