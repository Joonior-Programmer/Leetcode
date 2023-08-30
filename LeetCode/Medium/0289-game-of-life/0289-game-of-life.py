class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """

        row_len = len(board)
        col_len = len(board[0])
        count = [[0] * col_len for i in range(row_len)]

        if row_len > 1 and col_len > 1:
            count[0][0] = board[1][0] + board[1][1] + board[0][1]
            count[-1][0] = board[-2][0] + board[-2][1] + board[-1][1]
            count[0][-1] = board[0][-2] + board[1][-2] + board[1][-1]
            count[-1][-1] = board[-2][-1] + board[-2][-2] + board[-1][-2]
        elif row_len > 1:
            count[0][0] = board[1][0]
            count[-1][0] = board[-2][0]
        elif col_len > 1:
            count[0][0] = board[0][1]
            count[0][-1] = board[0][-2]

        for c in range(1, col_len - 1):
            count[0][c] = board[0][c-1] + board[0][c+1] 
            if row_len > 1:
                count[-1][c] = board[-1][c-1] + board[-1][c+1] + board[-2][c-1] + board[-2][c] + board[-2][c+1]
                count[0][c] += board[1][c-1] + board[1][c] + board[1][c+1]

        for r in range(1, row_len - 1):
            count[r][0] = board[r-1][0] + board[r+1][0]
            if col_len > 1:
                count[r][0] += board[r-1][1] + board[r][1] + board[r+1][1]
                count[r][-1] = board[r-1][-1] + board[r-1][-2] + board[r][-2] + board[r+1][-2] + board[r+1][-1]
        
        for r in range(1, row_len-1):
            for c in range(1, col_len-1):
                count[r][c] = board[r-1][c-1] + board[r-1][c] + board[r-1][c+1] + board[r][c-1] + board[r][c+1] + board[r+1][c-1] + board[r+1][c] + board[r+1][c+1]
        
        for r in range(row_len):
            for c in range(col_len):
                if board[r][c]:
                    if count[r][c] < 2:
                        board[r][c] = 0
                    elif count[r][c] > 3:
                        board[r][c] = 0
                elif count[r][c] == 3:
                    board[r][c] = 1