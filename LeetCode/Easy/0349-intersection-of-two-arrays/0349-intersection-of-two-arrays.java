class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> a = new HashMap<>();
        
        for (int i = 0; i < nums1.length; ++i){
            a.put(nums1[i], true);
        }

        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums2.length; ++i){
            if (a.getOrDefault(nums2[i], false)) {
                ret.add(nums2[i]);
                a.put(nums2[i], false);
            }
        }

        int[] result = new int[ret.size()];
        for (int i = 0; i < ret.size(); ++i){
            result[i] = ret.get(i);
        }
        
        return result;
    }
}