class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2000];
        int[] ret = new int[1001];
        
        for (int i = 0; i < arr.length; ++i) ++count[arr[i] + 1000];

        for (int i = 0; i < 2000; ++i){
            if (count[i] == 0) continue;
            if (ret[count[i]] != 0) return false;
            ++ret[count[i]];
        }
        return true;
    }
}