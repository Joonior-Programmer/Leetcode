class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] findBig = new int[10000];
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[nums1.length];

        for (int i = 0; i < nums2.length; ++i){
            while(!stack.empty() && stack.peek() < nums2[i]){
                int key = stack.pop();
                findBig[key] = nums2[i];
            }
            stack.push(nums2[i]);
        }
        
        for (int i = 0; i < nums1.length; ++i) ret[i] = findBig[nums1[i]] == 0 ? -1 : findBig[nums1[i]];
        
        return ret;
    }
}