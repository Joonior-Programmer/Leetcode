class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ret = new ArrayList<>();
        

        while(i > -1 && j > -1){
            if (nums1[i] == nums2[j]){
                ret.add(nums1[i]);
                i--;
                j--;
            } else if (nums1[i] > nums2[j]){
                i--;
            } else {
                j--;
            }
        }

        int[] result = new int[ret.size()];

        for (int k = 0; k < result.length; k++) {
            result[k] = ret.get(k);
        }

        return result;
    }
}