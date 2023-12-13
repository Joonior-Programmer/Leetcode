class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        ret = 0
        row_len, col_len = len(mat), len(mat[0])
        
        for row in range(row_len):
            for col in range(col_len):
                if mat[row][col] == 1:
                    condition = True
                    mat[row][col] = 0
                    for i in range(row_len):
                        if mat[i][col]:
                            condition = False
                            break
                    
                    if condition:
                        for i in range(col_len):
                            if mat[row][i]:
                                condition = False
                                break
                    
                    if condition:
                        ret += 1
                    mat[row][col] = 1
                    
        return ret
        
        