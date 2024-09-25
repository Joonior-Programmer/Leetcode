class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ret = new ArrayList();
        int i = 0;
        int n = s.length();
        
        while (i < n){
            int j = i + 1;
            char v = s.charAt(i);
            
            while (j < n && v == s.charAt(j)) j++;
            
            if (j - i > 2) ret.add(Arrays.asList(i, j - 1));
            i = j;
        }
        
        return ret;
    }
}