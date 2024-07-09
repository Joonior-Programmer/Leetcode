class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ret = 0;
        int curr = customers[0][0];
        
        for (int[] v : customers){
            curr = Math.max(curr, v[0]) + v[1];
            ret += curr - v[0];
        }
        
        return ret / customers.length;
    }
}