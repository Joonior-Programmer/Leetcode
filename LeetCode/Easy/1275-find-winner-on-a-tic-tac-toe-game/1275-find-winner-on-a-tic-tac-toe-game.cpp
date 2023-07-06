class Solution {
public:
    string tictactoe(vector<vector<int>>& moves) {
        bool A[3][3]{false};
        bool B[3][3]{false};
        
        bool is_A_turn = true;
        
        for (int i = 0; i < moves.size(); ++i){
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
        
        return moves.size() == 9 ? "Draw" : "Pending";
    }
};