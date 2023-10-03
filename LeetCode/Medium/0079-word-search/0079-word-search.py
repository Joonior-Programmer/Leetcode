class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        row_len = len(board) - 1
        col_len = len(board[0]) - 1

        visited = set()
        
        def dfs(row, col, idx):
            if idx == len(word):
                return True
            if board[row][col] != word[idx]:
                return False

            idx += 1

            if idx == len(word):
                return True

            visited.add((row, col))

            if row > 0 and (row-1, col) not in visited and dfs(row-1, col, idx):
                return True
            if row < row_len and (row+1, col) not in visited and dfs(row+1, col, idx):
                return True
            if col > 0 and (row, col-1) not in visited and dfs(row, col-1, idx):
                return True
            if col < col_len and (row, col+1) not in visited and dfs(row, col+1, idx):
                return True
            
            visited.remove((row,col))
            return False
        
        for row in range(row_len+1):
            for col in range(col_len+1):
                if dfs(row, col, 0):
                    return True
        


        return False

                

