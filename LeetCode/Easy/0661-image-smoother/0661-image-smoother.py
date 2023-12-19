class Solution:
    def imageSmoother(self, img: List[List[int]]) -> List[List[int]]:
        row_len = len(img)
        col_len = len(img[0])
        ret = [[0] * col_len for _ in range(row_len)]
        
        if row_len > 1 and col_len > 1:
            ret[0][0] = (img[0][0] + img[0][1] + img[1][0] + img[1][1]) // 4
            ret[-1][0] = (img[-1][0] + img[-1][1] + img[-2][0] + img[-2][1]) // 4
            ret[0][-1] = (img[0][-1] + img[0][-2] + img[1][-1] + img[1][-2]) // 4
            ret[-1][-1] = (img[-1][-1] + img[-1][-2] + img[-2][-1] + img[-2][-2]) // 4

            for col in range(1, col_len - 1):
                ret[0][col] = (img[0][col] + img[0][col-1] + img[0][col+1] + img[1][col] + img[1][col-1] + img[1][col+1]) // 6
                ret[-1][col] = (img[-1][col] + img[-1][col-1] + img[-1][col+1] + img[-2][col] + img[-2][col-1] + img[-2][col+1]) // 6

            for row in range(1, row_len - 1):
                ret[row][0] = (img[row][0] + img[row-1][0] + img[row+1][0] + img[row][1] + img[row-1][1] + img[row+1][1]) // 6
                ret[row][-1] = (img[row][-1] + img[row-1][-1] + img[row+1][-1] + img[row][-2] + img[row-1][-2] + img[row+1][-2]) // 6
            
        elif row_len > 1:
            ret[0][0] = (img[0][0] + img[1][0]) // 2
            ret[-1][0] = (img[-1][0] + img[-2][0]) // 2

            for row in range(1, row_len - 1):
                ret[row][0] = (img[row][0] + img[row-1][0] + img[row+1][0]) // 3

        elif col_len > 1:
            ret[0][0] = (img[0][0] + img[0][1]) // 2
            ret[0][-1] = (img[0][-1] + img[0][-2]) // 2

            for col in range(1, col_len - 1):
                ret[0][col] = (img[0][col] + img[0][col-1] + img[0][col+1]) // 3
        else:
            return img

        for row in range(1, row_len-1):
            for col in range(1, col_len-1):
                ret[row][col] = (img[row][col] + img[row-1][col] + img[row+1][col] + img[row][col-1] + img[row][col+1] + img[row-1][col-1] + img[row-1][col+1] + img[row+1][col-1] + img[row+1][col+1]) // 9
        
        return ret
            
            
            