class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = [[0] * 9 for i in range(9)]
        col = [[0] * 9 for i in range(9)]
        box = [[0] * 9 for i in range(9)]

        for r in range(9):
            for c in range(9):
                v = ord(board[r][c]) - 49

                if v < 0:
                    continue

                box_num = c // 3 + 3 * (r // 3)
                
                if row[r][v] or col[c][v] or box[box_num][v]:
                    return False
                
                row[r][v] += 1
                col[c][v] += 1
                box[box_num][v] += 1
        
        return True