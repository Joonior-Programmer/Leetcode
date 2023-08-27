class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = [[0] * 9 for i in range(9)]
        col = [[0] * 9 for i in range(9)]
        box = [[0] * 9 for i in range(9)]

        for r in range(9):
            for c in range(9):
                v = board[r][c]

                if v == ".":
                    continue
                v = int(v) - 1

                box_num = (0 if c < 3 else 1 if c < 6 else 2) + (3 * (0 if r < 3 else 1 if r < 6 else 2))
                if row[r][v]:
                    return False
                if col[c][v]:
                    return False
                if box[box_num][v]:
                    return False
                
                row[r][v] += 1
                col[c][v] += 1
                box[box_num][v] += 1
        
        return True