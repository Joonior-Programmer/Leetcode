class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int[] count = new int[501];
        
        for (int v : arr) ++count[v];
        
        for (int i = n; i > 0; i--)
            if (count[i] == i) return i;
        
        return -1;
    }
}