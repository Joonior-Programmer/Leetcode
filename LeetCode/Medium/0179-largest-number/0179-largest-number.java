class Solution {
    public String largestNumber(int[] nums) {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if (numStrs[0].equals("0")) {
            return "0";
        }

        StringBuilder ret = new StringBuilder();
        for (String num : numStrs) {
            ret.append(num);
        }
        
        return ret.toString();
    }
}