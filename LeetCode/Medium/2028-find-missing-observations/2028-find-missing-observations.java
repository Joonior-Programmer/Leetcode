class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sumCurr = 0;
        
        for (int i = 0; i < m; ++i) sumCurr += rolls[i];
        
        int need = (n + m) * mean - sumCurr;
        double average = (double) need / n;
        
        if (average > 6 || average < 1) return new int[0];
        
        int avg = (int) average;
        int[] ret = new int[n];
        int idx = 0;
        
        while (n > 0) {
            ret[idx++] = avg;
            need -= avg;
            n--;
        }
        
        for (int i = 0; i < need; i++) {
            ++ret[i];
        }
        
        return ret;
    }
}