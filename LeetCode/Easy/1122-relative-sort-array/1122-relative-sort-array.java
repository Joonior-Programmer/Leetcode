class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        int idx = 0;
        
        for (int i = 0; i < arr1.length; ++i) ++count[arr1[i]];
        
        for (int v : arr2){
            while (count[v] > 0){
                arr1[idx++] = v;
                count[v]--;
            }
        }
        
        for (int i = 0; i < 1001; ++i)
            while (count[i] > 0){
                arr1[idx++] = i;
                count[i]--;
            }
        
        return arr1;
    }
}