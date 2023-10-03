class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        row_len = len(board) - 1
        col_len = len(board[0]) - 1
        
        def dfs(row, col, idx):
            idx += 1
            
            if idx == len(word):
                return True

            temp = board[row][col]
            board[row][col] = "?"

            if row > 0 and board[row-1][col] == word[idx] and dfs(row-1, col, idx):
                return True
            if row < row_len and board[row+1][col] == word[idx] and dfs(row+1, col, idx):
                return True
            if col > 0 and board[row][col-1] == word[idx] and dfs(row, col-1, idx):
                return True
            if col < col_len and board[row][col+1] == word[idx] and dfs(row, col+1, idx):
                return True
            
            board[row][col] = temp
            
            return False
        
        for row in range(row_len+1):
            for col in range(col_len+1):
                if board[row][col] == word[0] and dfs(row, col, 0):
                    return True
        


        return False

                

