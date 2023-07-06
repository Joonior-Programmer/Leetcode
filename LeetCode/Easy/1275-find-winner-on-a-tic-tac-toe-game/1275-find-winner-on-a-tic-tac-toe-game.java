class Solution {
    public String tictactoe(int[][] moves) {
        boolean[][] A = new boolean[3][3];
        boolean[][] B = new boolean[3][3];
        
        boolean is_A_turn = true;
        
        for (int i = 0; i < moves.length; ++i){
            if (is_A_turn) A[moves[i][0]][moves[i][1]] = true;
            else B[moves[i][0]][moves[i][1]] = true;
            is_A_turn = !is_A_turn;
        }
        
        if ((A[0][0] && A[1][1] && A[2][2]) || (A[2][0] && A[1][1] && A[0][2])) return "A";
        if ((B[0][0] && B[1][1] && B[2][2]) || (B[2][0] && B[1][1] && B[0][2])) return "B";
        
        if ((A[0][0] && A[1][0] && A[2][0]) || (A[0][1] && A[1][1] && A[2][1]) || (A[0][2] && A[1][2] && A[2][2])) return "A";
        if ((B[0][0] && B[1][0] && B[2][0]) || (B[0][1] && B[1][1] && B[2][1]) || (B[0][2] && B[1][2] && B[2][2])) return "B";
        
        if ((A[0][0] && A[0][1] && A[0][2]) || (A[1][0] && A[1][1] && A[1][2]) || (A[2][0] && A[2][1] && A[2][2])) return "A";
        if ((B[0][0] && B[0][1] && B[0][2]) || (B[1][0] && B[1][1] && B[1][2]) || (B[2][0] && B[2][1] && B[2][2])) return "B";
        
        return moves.length == 9 ? "Draw" : "Pending";
    }
}