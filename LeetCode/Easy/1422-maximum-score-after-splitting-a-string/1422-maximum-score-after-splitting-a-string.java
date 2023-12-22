class Solution {
    public int maxScore(String s) {
        char[] sCharArray = s.toCharArray();
        int sum = 0;
        int ones = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < sCharArray.length - 1; ++i) {
            if (sCharArray[i] == '0') ++sum;
            else {
                ++ones;
                sum--;
            }
            
            if (sum > max) max = sum;
        }

        if (sCharArray[sCharArray.length - 1] == '1') ++ones;
        
        return max + ones;
    }
}