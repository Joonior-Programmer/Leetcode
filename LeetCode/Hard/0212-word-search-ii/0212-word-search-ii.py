class Solution:
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        row_len = len(board) - 1
        col_len = len(board[0]) - 1

        trie = {}

        for word in words:
            curr = trie
            for v in word:
                if v not in curr:
                    curr[v] = {}
                curr = curr[v]
            curr["value"] = word

        ret = []

        def dfs(row, col, parent):
            if board[row][col] not in parent:
                return

            curr = parent[board[row][col]]

            if "value" in curr:
                ret.append(curr["value"])
                del curr["value"]

            temp = board[row][col]
            board[row][col] = "!"

            if row > 0:
                dfs(row - 1, col, curr)
            if row < row_len:
                dfs(row + 1, col, curr)
            if col > 0:
                dfs(row, col - 1, curr)
            if col < col_len:
                dfs(row, col + 1, curr)
            
            board[row][col] = temp

            if not curr:
                del parent[temp]
        
        for row in range(row_len + 1):
            for col in range(col_len + 1):
                if board[row][col] in trie:
                    dfs(row, col, trie)
        
        return ret