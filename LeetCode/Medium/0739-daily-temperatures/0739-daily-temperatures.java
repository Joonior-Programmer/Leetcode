class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int hottest = 0;
        int[] ret = new int[n];

        for (int i = n - 1; i > -1; i--){
            int curTemp = temperatures[i];

            if (curTemp >= hottest) {
                hottest = temperatures[i];
                continue;
            }

            int days = 1;

            while (curTemp >= temperatures[i+days]) days += ret[i + days];
            ret[i] = days;
        }

        return ret;
    }
}