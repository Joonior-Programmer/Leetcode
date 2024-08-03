class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length;
        int[] a = new int[1001];
        int[] b = new int[1001];
        
        for (int i = 0; i < n; ++i){
            ++a[target[i]];
            ++b[arr[i]];
        }
        
        for (int i = 1; i < 1001; ++i)
            if (a[i] != b[i])
                return false;
        
        return true;
    }
}