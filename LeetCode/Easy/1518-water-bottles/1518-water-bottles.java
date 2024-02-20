class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ret = numBottles;
        int left = 0;
        
        while (numBottles > 0){
            numBottles += left;
            left = 0;
            ret += (numBottles + left) / numExchange;
            left = numBottles % numExchange;
            numBottles /= numExchange;
        }
        
        return ret;
    }
}