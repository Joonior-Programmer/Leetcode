class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ret = letters[0];
        for(int i = 0; i < letters.length; ++i){
            if(letters[i] > target) return letters[i];
        }
        return ret;
    }
}