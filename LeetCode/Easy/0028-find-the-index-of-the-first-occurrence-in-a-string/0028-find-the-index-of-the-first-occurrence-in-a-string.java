class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        while (i < haystack.length()){
            if (haystack.charAt(i) == needle.charAt(0)){
                if (i + needle.length() > haystack.length()) {
                    return -1;
                    }
                boolean isEqual = true;
                boolean isChanged = false;
                int temp = i;
                for (int j = 1; j < needle.length(); ++j){
                    if (!isChanged && haystack.charAt(i+j) == needle.charAt(0)) {
                        temp = i + j - 1;
                        isChanged = true;
                        }
                    if (haystack.charAt(i+j) != needle.charAt(j)){
                        if (!isChanged) temp = i + j;
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) return i;
                i = temp;
            }
            ++i;
        }
        return -1;
    }
}