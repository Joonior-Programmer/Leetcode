class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap();
        int[] count = new int[n+1];
        int ret = 0;
        
        for (int i = 0; i < n; ++i) map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        
        for (Integer v : map.keySet()) {
            ++ret;
            ++count[map.get(v)];
        }
        
        int i = 1;
        
        while (k > 0){
            if (count[i] > 0){
                count[i]--;
                ret--;
                k -= i;
            } else ++i;
        }
        
        if (k < 0) return ret + 1;
        return ret;
        
    }
}