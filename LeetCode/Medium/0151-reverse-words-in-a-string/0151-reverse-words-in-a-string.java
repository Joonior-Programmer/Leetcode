class Solution {
    public String reverseWords(String s) {
        ArrayList<String> ret = new ArrayList<>();
        char[] sCharArray = s.toCharArray();
        int left = 0;
        int right = 0;
        
        while (right < sCharArray.length){
            while (left < sCharArray.length && sCharArray[left] == ' ') ++left;
            right = left;
            while (right < sCharArray.length && sCharArray[right] != ' ') ++right;
            if (left != right){
                ret.add(s.substring(left, right));
                ++right;
                left = right;
            }
        }
        
        Collections.reverse(ret);
        
        return String.join(" ", ret);
    }
}