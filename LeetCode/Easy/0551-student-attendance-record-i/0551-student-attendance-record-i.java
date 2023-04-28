class Solution {
    public boolean checkRecord(String s) {
        int L = 0;
        int A = 0;
        for(char v : s.toCharArray()){
            if (v == 'L') {
                if (++L > 2) return false;
            }
            else if (v == 'A'){
                if (++A > 1) return false;
                L = 0;
            } else {L = 0;}
        }
        return true;
    }
}