class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> count = new HashMap();
        int n = arr.length;
        
        
        for (String v : arr) count.put(v, count.getOrDefault(v, 0) + 1);
        
        for (String v : arr) 
            if (count.get(v) == 1) {
                k--;
                if (k == 0) return v;
            }
        
        return "";
    }
}