class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        for (int i = 0; i < nums1.length; ++i){
            a.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; ++i){
            b.add(nums2[i]);
        }

        ArrayList<Integer> ret = new ArrayList<>();
        for (int v : a){
            if (b.contains(v)) ret.add(v);
        }

        int[] result = new int[ret.size()];
        for (int i = 0; i < ret.size(); ++i){
            result[i] = ret.get(i);
        }
        
        return result;
    }
}