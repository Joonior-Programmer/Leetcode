class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ret = 0;
        char[] colorsCharArray = colors.toCharArray();
        char prev = colorsCharArray[0];
        int prevTime = neededTime[0];
        
        for (int i = 1; i < neededTime.length; ++i){
            if (prev == colorsCharArray[i]){
                ret += Math.min(prevTime, neededTime[i]);
                prevTime = Math.max(prevTime, neededTime[i]);
            } else {
                prev = colorsCharArray[i];
                prevTime = neededTime[i];
            }
        }
        
        return ret;
    }
}