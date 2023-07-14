class Solution:
    def nearestExit(self, maze: List[List[str]], entrance: List[int]) -> int:
        ret = -1
        q = []

        temp = 0

        row_len = len(maze) - 1
        col_len = len(maze[0]) - 1

        for i in range(row_len+1):
            if maze[i][0] == "." and (i != entrance[0] or 0 != entrance[1]):
                q.append([i,0])
                maze[i][0] = "+"
            if maze[i][col_len] == "." and (i != entrance[0] or col_len != entrance[1]):
                q.append([i,col_len])
                maze[i][col_len] = "+"
        
        for i in range(col_len+1):
            if maze[0][i] == "." and (0 != entrance[0] or i != entrance[1]):
                q.append([0,i])
                maze[0][i] = "+"
            if maze[row_len][i] == "." and (row_len != entrance[0] or i != entrance[1]):
                q.append([row_len,i])
                maze[row_len][i] = "+"

        while ret == -1 and q:
            temp_q = []

            while q:
                row, col = q.pop()

                if row == entrance[0] and col == entrance[1]:
                    ret = temp
                    break

                if row > 0 and maze[row-1][col] == ".":
                    temp_q.append([row-1, col])
                    maze[row-1][col] = "+"
                if row < row_len and maze[row+1][col] == ".":
                    temp_q.append([row+1, col])
                    maze[row+1][col] = "+"
                if col > 0 and maze[row][col-1] == ".":
                    temp_q.append([row, col-1])
                    maze[row][col-1] = "+"
                if col < col_len and maze[row][col+1] == ".":
                    temp_q.append([row, col+1])
                    maze[row][col+1] = "+"

            temp += 1
            q = temp_q

        return ret




                


