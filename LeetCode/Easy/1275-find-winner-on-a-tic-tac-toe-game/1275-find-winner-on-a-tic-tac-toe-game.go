func tictactoe(moves [][]int) string {
    A := make([][]bool, 3)
    B := make([][]bool, 3)

    for i := 0; i < 3; i++ { A[i] = make([]bool, 3) }
    for i := 0; i < 3; i++ { B[i] = make([]bool, 3) }
    
    is_A_turn := true;

    for i := 0; i < len(moves); i++ {
        if is_A_turn {
            A[moves[i][0]][moves[i][1]] = true
        } else { B[moves[i][0]][moves[i][1]] = true }
        is_A_turn = !is_A_turn
    }

    if (A[0][0] && A[1][1] && A[2][2]) || (A[2][0] && A[1][1] && A[0][2]) { return "A" }
    if (B[0][0] && B[1][1] && B[2][2]) || (B[2][0] && B[1][1] && B[0][2])  { return "B" }

    if (A[0][0] && A[1][0] && A[2][0]) || (A[0][1] && A[1][1] && A[2][1]) || (A[0][2] && A[1][2] && A[2][2]) { return "A" }
    if (B[0][0] && B[1][0] && B[2][0]) || (B[0][1] && B[1][1] && B[2][1]) || (B[0][2] && B[1][2] && B[2][2]) { return "B" }

    if (A[0][0] && A[0][1] && A[0][2]) || (A[1][0] && A[1][1] && A[1][2]) || (A[2][0] && A[2][1] && A[2][2]) { return "A" }
    if (B[0][0] && B[0][1] && B[0][2]) || (B[1][0] && B[1][1] && B[1][2]) || (B[2][0] && B[2][1] && B[2][2]) { return "B" }

    if len(moves) == 9 { return "Draw" }
    return "Pending"
}