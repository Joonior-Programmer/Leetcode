class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        
        for (char v : moves.toCharArray()){
            if (v == 'U') ++y;
            else if (v == 'D') y--;
            else if (v == 'R') ++x;
            else x--;
        }
        
        return x == 0 && y == 0;
    }
}