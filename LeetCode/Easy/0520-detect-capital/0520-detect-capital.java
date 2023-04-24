class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isLower = false;
        boolean isUpper = true;
        char[] wordArray = word.toCharArray();
        if (wordArray[0] > 95 && wordArray[0] < 123){
            isLower = true;
            isUpper = false;
        }
        if (isLower){
            for (int i = 1; i < wordArray.length; ++i) {
                if (!(wordArray[i] > 95 && wordArray[i] < 123)) return false;
            }
        } else {
            for (int i = 1; i < wordArray.length; ++i){
                if (i > 1 && !isLower && wordArray[i] > 95 && wordArray[i] < 123) return false;
                else if (isLower && isUpper && !(wordArray[i] > 95 && wordArray[i] < 123)) return false;
                else if (wordArray[i] > 95 && wordArray[i] < 123) isLower = true;
            }
        }
        return true;
    }
}