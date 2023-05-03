class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> isExist1 = new HashSet();
        HashSet<Integer> isExist2 = new HashSet();
        
        for (int i = 0; i < nums1.length; ++i) isExist1.add(nums1[i]);
        for (int i = 0; i < nums2.length; ++i) isExist2.add(nums2[i]);
        
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for (Integer v : isExist1){
            if (!isExist2.contains(v)) first.add(v);
        }
        for (Integer v : isExist2){
            if (!isExist1.contains(v)) second.add(v);
        }
        ret.add(first);
        ret.add(second);
        return ret;
    }
}