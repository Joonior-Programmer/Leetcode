class Solution:
    def tictactoe(self, moves: List[List[int]]) -> str:
        A = [[0] * 3 for i in range(3)]
        B = [[0] * 3 for i in range(3)]
        
        is_A_turn = True

        for v in moves:
            if is_A_turn:
                A[v[0]][v[1]] = 1
            else:
                B[v[0]][v[1]] = 1
            is_A_turn = not is_A_turn


        for i in range(3):
            if sum(A[i]) == 3:
                return "A"
            elif sum(B[i]) == 3:
                return "B"
        
        for v in zip(*A):
            if sum(v) == 3:
                return "A"

        for v in zip(*B):
            if sum(v) == 3:
                return "B"
        
        if A[0][0] and A[1][1] and A[2][2]:
            return "A"
        
        if B[0][0] and B[1][1] and B[2][2]:
            return "B"
        
        if A[0][2] and A[1][1] and A[2][0]:
            return "A"
        
        if B[0][2] and B[1][1] and B[2][0]:
            return "B"

        return "Draw" if len(moves) == 9 else "Pending"