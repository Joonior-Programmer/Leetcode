class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> findBig = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[nums1.length];
        
        for (int i = 0; i < nums2.length; ++i){
            while(!stack.empty() && stack.peek() < nums2[i]){
                int key = stack.pop();
                findBig.put(key, nums2[i]);
            }
            stack.push(nums2[i]);
        }
        
        for (int i = 0; i < nums1.length; ++i) ret[i] = findBig.getOrDefault(nums1[i], -1);
        
        return ret;
    }
}