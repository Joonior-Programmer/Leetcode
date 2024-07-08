class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        players = [False] * n
        i = 0
        k -= 1
        turn = k
        ret = 0

        for j in range(n - 1):
            while turn > 0:
                if i == n:  i -= n 
                if players[i]:
                    i += 1
                else:
                    turn -= 1
                    i += 1

            if i >= n: i = 0
                
            while players[i]:
                i += 1
                if i == n:  i = 0 
            
            players[i] = True
            i += 1
            turn = k

        for j in range(n):
            if not players[j]:
                ret = j + 1
                break

        return ret